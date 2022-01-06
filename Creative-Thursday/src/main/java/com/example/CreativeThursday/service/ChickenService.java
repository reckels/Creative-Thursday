package com.example.CreativeThursday.service;

import com.example.CreativeThursday.model.Chicken;
import com.example.CreativeThursday.repository.ChickenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChickenService {

    @Autowired
    private static ChickenRepository chickenRepository;

    public static Chicken addChicken(Chicken chicken) {
        return chickenRepository.save(chicken);
    }
}
