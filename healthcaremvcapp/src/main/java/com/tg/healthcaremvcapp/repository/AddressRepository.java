package com.tg.healthcaremvcapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tg.healthcaremvcapp.models.Address;

public interface AddressRepository extends JpaRepository<Address,Long>{

}
