package com.example.CreativeThursday.controller;


import com.example.CreativeThursday.model.Chicken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ChickenController {

    @PostMapping("chicken")
    public Chicken addChicken(@RequestBody Chicken chicken) {
        return chicken;
    }
}
