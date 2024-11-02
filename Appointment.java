package com.hospital.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointments") // Ensure this matches your database table name
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "doctor_id")
    private int doctorId;

    @Column(name = "appointment_date")
    @Temporal(TemporalType.TIMESTAMP) // Use the appropriate type based on your database schema
    private Date appointmentDate;

    @Column(name = "status")
    private String status;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Appointment ID: " + id +
               ", Appointment Date: " + appointmentDate +
               ", Doctor ID: " + doctorId +
               ", Patient ID: " + patientId +
               ", Status: " + status;
    }

}

