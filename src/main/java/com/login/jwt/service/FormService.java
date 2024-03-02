package com.login.jwt.service;

import com.login.jwt.dao.FormRepo;
import com.login.jwt.entity.FormArrival;
import com.login.jwt.entity.Season;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {
    @Autowired
    private FormRepo formRepo;


    public FormArrival createForm(FormArrival formArrival){
        return formRepo.save(formArrival);
    }

    public List<FormArrival> findBySeasons(Season spring) {
        return formRepo.findByseason(spring);
    }
//    public List<FormArrival> getstudentforms(){
//        return formRepo.findAll();
//    }
}
