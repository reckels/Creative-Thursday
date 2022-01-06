package com.example.CreativeThursday.controller;

import com.example.CreativeThursday.model.Chicken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class IndexController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("something", "This is something from the controller");
        model.addAttribute("chickens", Arrays.asList(
                new Chicken(1, "Abe"),
                new Chicken(2, "Brenda"),
                new Chicken(3, "Carlos")
        ));
        return "index";
    }

}
