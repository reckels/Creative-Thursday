package com.example.CreativeThursday.repository;

import com.example.CreativeThursday.model.Chicken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChickenRepository extends JpaRepository<Chicken, Integer> {
    List<Chicken> findAll();
    Chicken findByNameContaining(String name);
    Chicken findById(int id);
    Chicken deleteById(int id);
}
