package com.hospital.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hospital.Config.HibernateUtil;


import java.util.List;

public class GenericDAO<T> {

    public void save(T entity) {
        executeWithinTransaction(session -> session.save(entity));
    }

    public void update(T entity) {
        executeWithinTransaction(session -> session.update(entity));
    }

    public T findById(Class<T> entityClass, int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(entityClass, id);
        }
    }

    public void delete(T entity) {
        executeWithinTransaction(session -> session.delete(entity));
    }

    public List<T> findAll(Class<T> entityClass) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from " + entityClass.getSimpleName(), entityClass).list();
        }
    }

    // Utility method to execute any session operation in a transaction
    protected void executeWithinTransaction(SessionOperation operation) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            operation.execute(session);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FunctionalInterface
    protected interface SessionOperation {
        void execute(Session session);
    }
}
