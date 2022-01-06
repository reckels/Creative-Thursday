package com.example.CreativeThursday.controller;


import com.example.CreativeThursday.model.Chicken;
import com.example.CreativeThursday.service.ChickenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ChickenController {

    @Autowired
    ChickenService chickenService;

    @PostMapping("/chicken")
    public Chicken addChicken(int id, String name, String breed, String imageUrl) {
        Chicken c = new Chicken(id, name, breed, imageUrl);
        return chickenService.addChicken(c);
    }

    @GetMapping("/chicken2")
    public List<Chicken> findChickens(){return chickenService.findChickens();}

    @GetMapping("/chicken3")
    public Chicken findChicken(String name) {return chickenService.findChicken(name);}
}
