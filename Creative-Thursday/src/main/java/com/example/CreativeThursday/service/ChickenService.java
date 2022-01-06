package com.example.CreativeThursday.service;

import com.example.CreativeThursday.model.Chicken;
import com.example.CreativeThursday.repository.ChickenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChickenService {

    @Autowired
    private ChickenRepository chickenRepository;

    public Chicken addChicken(Chicken chicken) {
        return chickenRepository.save(chicken);
    }

    public List<Chicken> findChickens() {return chickenRepository.findAll();}

    public Chicken findChicken(String name) {return chickenRepository.findByNameContaining(name);}
}
