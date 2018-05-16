package com.ais.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ais.swagger.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
