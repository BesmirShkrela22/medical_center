package com.example.medical_center.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long doctorId;
    @Column(unique = true)
    private String username;
    private String specilization;
    @OneToMany(mappedBy = "doctor")
    @JsonIgnore// eleminon lupin e pafundem, do vin vetem vlerat
    private List<Appointment> appointment;
}
