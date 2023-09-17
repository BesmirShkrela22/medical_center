package com.example.medical_center.dao;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.spi.Status;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    private String patientName;
    private String note;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime beginAt;
    private LocalDateTime endAt;
    @ManyToOne
    @JoinColumn(name = "doctor")
    private Doctor doctor;

    @OneToOne(mappedBy = "appointment")
    private Report report;

}

