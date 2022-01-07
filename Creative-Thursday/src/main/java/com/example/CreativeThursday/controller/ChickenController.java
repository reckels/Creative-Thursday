package com.example.CreativeThursday.controller;


import com.example.CreativeThursday.model.Chicken;
import com.example.CreativeThursday.repository.ChickenRepository;
import com.example.CreativeThursday.service.ChickenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ChickenController {

    @Autowired
    ChickenService chickenService;

    @Autowired
    ChickenRepository chickenRepository;

    @GetMapping("/chicken")
    public String main(Model model) {
        Chicken chicken = new Chicken();
        model.addAttribute("chicken", chicken);
        model.addAttribute("something", "Fowl Finder");
        model.addAttribute("chickens", chickenRepository.findAll());
        return "index";
    }

    @PostMapping("/chicken")
    public String addChicken(@ModelAttribute("chicken") Chicken chicken, Model model) {
        chickenService.addChicken(chicken);
        model.addAttribute("chicken", chicken);
        return "chicken_added";
    }

    @GetMapping("/chicken_edit")
    public String findChicken(@ModelAttribute("chicken") Chicken chicken, Model model) {
        model.addAttribute("title", "Chicken Editor");
        Chicken chicken2 = chickenService.findChicken("Francis");
        model.addAttribute("chicken", chicken2);
        updateChicken(chicken, model);
        return "chicken_edit";
    }

    @PostMapping("/chicken_edit")
    public String updateChicken(Chicken chicken, Model model){
        chickenRepository.save(chicken);
//        var c = chickenService.findChickenById(chicken.getId());
//        c.setName(chicken.getName());
//        c.setBreed(chicken.getBreed());
//        c.setImageUrl(chicken.getImageUrl());
        return "chicken_added";
    }

//    @PostMapping("/chicken_edit")
//    public String deleteChicken(Chicken chicken, Model model){
//        chickenService.deleteChicken(chicken.getId());
//        return "chicken_added";
//    }
}
