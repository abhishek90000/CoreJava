package com.hospital.DAO;

import com.hospital.model.Doctor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hospital.Config.HibernateUtil;


import java.util.List;

public class DoctorDAO extends GenericDAO<Doctor> {

    // Find doctors by specialization
    public List<Doctor> findBySpecialization(String specialization) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Doctor> query = session.createQuery(
                "FROM Doctor WHERE specialization = :specialization", Doctor.class);
            query.setParameter("specialization", specialization);
            return query.list();
        }
    }

    // Find doctors by name
    public List<Doctor> findByName(String name) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Doctor> query = session.createQuery(
                "FROM Doctor WHERE name LIKE :name", Doctor.class);
            query.setParameter("name", "%" + name + "%");
            return query.list();
        }
    }
}
