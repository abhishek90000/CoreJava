package com.hospital.DAO;

import com.hospital.model.Billing;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hospital.Config.HibernateUtil;

import java.util.Date;
import java.util.List;

public class BillingDAO extends GenericDAO<Billing> {

    // Find billings within a date range
    public List<Billing> findByDateRange(Date startDate, Date endDate) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Billing> query = session.createQuery(
                "FROM Billing WHERE date BETWEEN :startDate AND :endDate", Billing.class);
            query.setParameter("startDate", startDate);
            query.setParameter("endDate", endDate);
            return query.list();
        }
    }

    // Find billings above a certain amount
    public List<Billing> findByAmountGreaterThan(double amount) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Billing> query = session.createQuery(
                "FROM Billing WHERE amount > :amount", Billing.class);
            query.setParameter("amount", amount);
            return query.list();
        }
    }
    
    
    // Find billing records by patient ID
    public List<Billing> findByPatientId(int patientId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Billing> query = session.createQuery(
                "FROM Billing WHERE patient.id = :patientId", Billing.class);
            query.setParameter("patientId", patientId);
            return query.list();
        }
    }
}
