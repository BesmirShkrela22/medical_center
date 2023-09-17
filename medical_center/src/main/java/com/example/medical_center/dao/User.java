package com.example.medical_center.dao;

import com.example.medical_center.static_data.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    @Column(unique = true)
    private  String Username;
    @Enumerated(EnumType.STRING)
    private Role role;






}
