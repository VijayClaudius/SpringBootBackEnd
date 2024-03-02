package com.login.jwt.dao;

import com.login.jwt.entity.FormArrival;
import com.login.jwt.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormRepo extends JpaRepository<FormArrival,Long> {


   public List<FormArrival> findByseason(Season spring);
}
