package com.example.medical_center.services.impl;

import com.example.medical_center.dao.Doctor;
import com.example.medical_center.exeption.GenericExeption;
import com.example.medical_center.repositories.DoctorRepository;
import com.example.medical_center.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    @Override
    public Doctor create(Doctor doctor) {
        if(doctor.getDoctorId()!=null){
            throw GenericExeption.idNotNull();
        }else{
            doctorRepository.save(doctor);
            return doctor;
        }
    }

    @Override
    public Doctor update(Doctor doctor) {
        if(doctor.getDoctorId()!=null){
            throw GenericExeption.idNotNull();

        }else{
            doctorRepository.save(doctor);
            return doctor;
        }
    }

    @Override
    public Doctor findById(Long id) {
        Optional<Doctor> doctor = doctorRepository.findById(id);
        return doctor.orElseThrow(()-> GenericExeption.notFound(id));
    }

    @Override
    public List<Doctor> findAll() {
       return doctorRepository.findAll();
    }

    @Override
    public String delete(Long id) {
        doctorRepository.deleteById(id);
        return String.format("Record with id%d deleted",id);
    }
}
