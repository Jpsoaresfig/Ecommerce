package com.jp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.ecommerce.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {}