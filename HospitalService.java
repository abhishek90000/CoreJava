package com.hospital.service;

import com.hospital.DAO.*;
import com.hospital.model.*;

import java.util.Date;
import java.util.List;

public class HospitalService {
    private DoctorDAO doctorDAO = new DoctorDAO();
    private PatientDAO patientDAO = new PatientDAO();
    private AppointmentDAO appointmentDAO = new AppointmentDAO();
    private BillingDAO billingDAO = new BillingDAO();

    // ------------------- Doctor Operations -------------------

    // Add a new doctor
    public void addDoctor(String name, String specialization, String contact) {
        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setContact(contact);
        doctorDAO.save(doctor);
    }

    // Retrieve a doctor by ID
    public Doctor getDoctorById(int doctorId) {
        return doctorDAO.findById(Doctor.class, doctorId);
    }

    // Update doctor details
    public void updateDoctor(int doctorId, String name, String specialization, String contact) {
        Doctor doctor = getDoctorById(doctorId);
        if (doctor != null) {
            doctor.setName(name);
            doctor.setSpecialization(specialization);
            doctor.setContact(contact);
            doctorDAO.update(doctor);
        }
    }

    // Delete a doctor by ID
    public boolean deleteDoctor(int doctorId) {
        Doctor doctor = getDoctorById(doctorId);
        if (doctor != null) {
            doctorDAO.delete(doctor);
            return true;
        }
        return false;
    }

    // Retrieve all doctors
    public List<Doctor> getAllDoctors() {
        return doctorDAO.findAll(Doctor.class);
    }

    // ------------------- Patient Operations -------------------

    // Add a new patient
    public void addPatient(String name, int age, String contact, String address) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setAge(age);
        patient.setContact(contact);
        patient.setAddress(address);
        patientDAO.save(patient);
    }

    // Retrieve a patient by ID
    public Patient getPatientById(int patientId) {
        return patientDAO.findById(Patient.class, patientId);
    }

    // Update patient details
    public void updatePatient(int patientId, String name, int age, String contact, String address) {
        Patient patient = getPatientById(patientId);
        if (patient != null) {
            patient.setName(name);
            patient.setAge(age);
            patient.setContact(contact);
            patient.setAddress(address);
            patientDAO.update(patient);
        }
    }

    // Delete a patient by ID
    public boolean deletePatient(int patientId) {
        Patient patient = getPatientById(patientId);
        if (patient != null) {
            patientDAO.delete(patient);
            return true;
        }
        return false;
    }

    // Retrieve all patients
    public List<Patient> getAllPatients() {
        return patientDAO.findAll(Patient.class);
    }

    // ------------------- Appointment Operations -------------------

    // Schedule an appointment
    public void scheduleAppointment(int patientId, int doctorId, Date appointmentDate, String status) {
        // Validate appointment date
        if (isValidAppointmentDate(appointmentDate)) {
            Appointment appointment = new Appointment();
            appointment.setPatientId(patientId);
            appointment.setDoctorId(doctorId);
            appointment.setAppointmentDate(appointmentDate);
            appointment.setStatus(status);
            appointmentDAO.save(appointment);
            System.out.println("Appointment scheduled successfully for Patient ID: " + patientId);
        } else {
            System.out.println("Error: Appointment date must be in the future.");
        }
    }

    // Validate the appointment date
    private boolean isValidAppointmentDate(Date appointmentDate) {
        return appointmentDate != null && appointmentDate.after(new Date());
    }

    // Retrieve all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentDAO.findAll(Appointment.class);
    }

    // Retrieve appointments by patient ID
    public List<Appointment> getAppointmentsByPatientId(int patientId) {
        return appointmentDAO.findByPatientId(patientId);
    }

    // Update appointment status
    public void updateAppointmentStatus(int appointmentId, String status) {
        Appointment appointment = appointmentDAO.findById(Appointment.class, appointmentId);
        if (appointment != null) {
            appointment.setStatus(status);
            appointmentDAO.update(appointment);
        }
    }

    // Delete an appointment by ID
    public boolean deleteAppointment(int appointmentId) {
        Appointment appointment = appointmentDAO.findById(Appointment.class, appointmentId);
        if (appointment != null) {
            appointmentDAO.delete(appointment);
            return true;
        }
        return false;
    }

    // ------------------- Billing Operations -------------------

    // Add billing record for a patient
    public void addBilling(int patientId, double amount, Date billingDate) {
        Patient patient = getPatientById(patientId);
        if (patient != null) {
            Billing billing = new Billing();
            billing.setPatient(patient);
            billing.setAmount(amount);
            billing.setDate(billingDate);
            billingDAO.save(billing);
        }
    }

    // Retrieve billing records by patient ID
    public List<Billing> getBillingsByPatientId(int patientId) {
        return billingDAO.findByPatientId(patientId);
    }

    // Retrieve all billing records
    public List<Billing> getAllBillings() {
        return billingDAO.findAll(Billing.class);
    }

    // Delete billing record by ID
    public boolean deleteBilling(int billingId) {
        Billing billing = billingDAO.findById(Billing.class, billingId);
        if (billing != null) {
            billingDAO.delete(billing);
            return true;
        }
        return false;
    }
}
