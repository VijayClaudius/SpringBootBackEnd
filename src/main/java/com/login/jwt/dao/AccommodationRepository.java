package com.login.jwt.dao;

import com.login.jwt.entity.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    List<Accommodation> findByAvailable(boolean available);
    List<Accommodation> findByLocation(String location);
    // Add custom query methods as needed
}

