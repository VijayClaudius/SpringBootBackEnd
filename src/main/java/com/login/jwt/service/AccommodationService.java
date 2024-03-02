package com.login.jwt.service;

import com.login.jwt.dao.AccommodationRepository;
import com.login.jwt.entity.Accommodation;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AccommodationService {
    @Autowired
    private  AccommodationRepository accommodationRepository;
//    private final AccommodationRepository accommodationRepository;

//    @Autowired
//    public AccommodationService(AccommodationRepository accommodationRepository) {
//        this.accommodationRepository = accommodationRepository;
//    }

    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    public List<Accommodation> getAccommodationById(Long id) {
        return accommodationRepository.findAllById(Collections.singleton(id));
//                .orElseThrow(() -> new NotFoundException("Accommodation not found with id: " + id));
    }

    public Accommodation createAccommodation(Accommodation accommodation) {
        // Perform any necessary validation or business logic before saving
        return accommodationRepository.save(accommodation);
    }

    public void deleteAccommodation(Long id) {
        // Perform any necessary validation or business logic before deleting
        accommodationRepository.deleteById(id);
    }

    public List<Accommodation> getAvailableAccommodations() {
        return accommodationRepository.findByAvailable(true);
    }

    public List<Accommodation> searchAccommodationsByLocation(String location) {
        return accommodationRepository.findByLocation(location);
    }
}

