package com.login.jwt.dao;


import com.login.jwt.entity.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportationRepo extends JpaRepository<Transportation, Long> {

}
