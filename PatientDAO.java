package com.hospital.DAO;

import com.hospital.model.Patient;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hospital.Config.HibernateUtil;


import java.util.List;

public class PatientDAO extends GenericDAO<Patient> {

    // Find patients by age
    public List<Patient> findByAge(int age) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Patient> query = session.createQuery(
                "FROM Patient WHERE age = :age", Patient.class);
            query.setParameter("age", age);
            return query.list();
        }
    }

    // Find patients by name
    public List<Patient> findByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Patient> query = session.createQuery(
                "FROM Patient WHERE name LIKE :name", Patient.class);
            query.setParameter("name", "%" + name + "%");
            return query.list();
        }
    }
}
