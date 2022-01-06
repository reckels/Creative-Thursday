package com.example.CreativeThursday.controller;

import com.example.CreativeThursday.model.Chicken;
import com.example.CreativeThursday.repository.ChickenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class IndexController {

    @Autowired
    ChickenController chickenController;
    @Autowired
    ChickenRepository chickenRepository;

    @GetMapping
    public String main(Model model) {
        model.addAttribute("something", "Fowl Finder");
        //chickenController.addChicken();
        model.addAttribute("chickens", chickenRepository.findAll());

        return "index";
    }
}
