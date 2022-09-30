package com.example.Jpa.repository;

import com.example.Jpa.model.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Id;

public interface PeopleRepository extends JpaRepository<People, Integer> {


    //public void select(){
        //dsfsfd
    //}
}
