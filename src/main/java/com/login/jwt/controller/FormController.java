package com.login.jwt.controller;

import com.login.jwt.dao.FormRepo;
import com.login.jwt.entity.FormArrival;
import com.login.jwt.entity.Season;
import com.login.jwt.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Form")
public class FormController {
    @Autowired
    private FormService formService;
    @Autowired
    private FormRepo formRepo;
    @PostMapping("/save")
    public FormArrival SaveForm(@RequestBody FormArrival formArrival){
        return formService.createForm(formArrival);
    }
    @PreAuthorize("hasRole('Admin')")
    @GetMapping("/getall")
    public List<FormArrival> getformData(){
        return formRepo.findAll();
    }
    @PreAuthorize("hasRole('Admin')")
    @GetMapping("/{selectedSeason}")
    public List<FormArrival> getstudentsofSpring(@PathVariable Season selectedSeason){
        return formService.findBySeasons(selectedSeason);
    }
}
