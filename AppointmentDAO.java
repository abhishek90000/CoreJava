package com.hospital.DAO;

import com.hospital.model.Appointment;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hospital.Config.HibernateUtil;


import java.util.Date;
import java.util.List;

public class AppointmentDAO extends GenericDAO<Appointment> {

    // Find appointments by doctor ID
    public List<Appointment> findByDoctorId(int doctorId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Appointment> query = session.createQuery(
                "FROM Appointment WHERE doctor.id = :doctorId", Appointment.class);
            query.setParameter("doctorId", doctorId);
            return query.list();
        }
    }

    // Find appointments by date
    public List<Appointment> findByDate(Date date) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Appointment> query = session.createQuery(
                "FROM Appointment WHERE appointmentDate = :date", Appointment.class);
            query.setParameter("date", date);
            return query.list();
        }
    }

    // Find appointments by status
    public List<Appointment> findByStatus(String status) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Appointment> query = session.createQuery(
                "FROM Appointment WHERE status = :status", Appointment.class);
            query.setParameter("status", status);
            return query.list();
        }
    }
    
    // Find appointments by patient ID
    public List<Appointment> findByPatientId(int patientId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Appointment> query = session.createQuery(
                "FROM Appointment WHERE patient.id = :patientId", Appointment.class);
            query.setParameter("patientId", patientId);
            return query.list();
        }
    }
    
}
