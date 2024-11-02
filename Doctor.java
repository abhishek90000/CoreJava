package com.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String specialization;
    private String contact;

    // Default constructor
    public Doctor() {
        super();
    }

    // Parameterized constructor
    public Doctor(int id, String name, String specialization, String contact) {
        super();
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Doctor{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Contact='" + contact + '\'' +
                ", Specialization='" + specialization + '\'' +
                '}';
    }
}
