package com.example.CreativeThursday.repository;

import com.example.CreativeThursday.model.Chicken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChickenRepository extends JpaRepository<Chicken, String> {
}
