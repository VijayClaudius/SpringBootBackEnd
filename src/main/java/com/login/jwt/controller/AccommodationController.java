package com.login.jwt.controller;

import com.login.jwt.entity.Accommodation;
import com.login.jwt.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {
    @Autowired
    private  AccommodationService accommodationService;
//    private final AccommodationService accommodationService;
//
//    @Autowired
//    public AccommodationController(AccommodationService accommodationService) {
//        this.accommodationService = accommodationService;
//    }

    @GetMapping("/getall")
    public List<Accommodation> getAllAccommodations() {
        return accommodationService.getAllAccommodations();
    }

    @GetMapping("/{AccID}")
    public List<Accommodation> getAccommodationById(@PathVariable Long AccID) {
        return accommodationService.getAccommodationById(AccID);
    }

    @PostMapping("/add")
    public Accommodation createAccommodation(@RequestBody Accommodation accommodation) {
        return accommodationService.createAccommodation(accommodation);
    }

    @DeleteMapping("/{id}")
    public void deleteAccommodation(@PathVariable Long id) {
        accommodationService.deleteAccommodation(id);
    }

    @GetMapping("/available")
    public List<Accommodation> getAvailableAccommodations() {
        return accommodationService.getAvailableAccommodations();
    }

    @GetMapping("/search")
    public List<Accommodation> searchAccommodationsByLocation(@RequestParam("location") String location) {
        return accommodationService.searchAccommodationsByLocation(location);
    }
}

