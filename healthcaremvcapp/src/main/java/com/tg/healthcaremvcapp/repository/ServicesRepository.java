package com.tg.healthcaremvcapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tg.healthcaremvcapp.models.Service;

public interface ServicesRepository extends JpaRepository<Service, Long>{

}