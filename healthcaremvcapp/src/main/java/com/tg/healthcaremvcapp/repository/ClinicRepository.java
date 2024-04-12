package com.tg.healthcaremvcapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tg.healthcaremvcapp.models.Clinic;

public interface ClinicRepository extends JpaRepository<Clinic, String>{

}