package com.example.Jpa.repository;


import com.example.Jpa.JpaApplicationTests;
import com.example.Jpa.model.entity.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;

@WebAppConfiguration
public class PeopleRepositoryTest extends JpaApplicationTests {
    @Autowired
    private PeopleRepository peopleRepository;

    @Test
    public void create(){
        People p = new People();
        p.setName("an");
        p.setEmail("an@naver.com");
        p.setCreateAt(LocalDateTime.now());
        p.setCreateBy("Test");

        System.out.println(p.toString());
        peopleRepository.save(p);
    }
}
