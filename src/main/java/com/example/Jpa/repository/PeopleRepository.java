package com.example.Jpa.repository;

import com.example.Jpa.model.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Integer> {
}
