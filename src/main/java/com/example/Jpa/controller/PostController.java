package com.example.Jpa.controller;

import com.example.Jpa.model.test.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ryeon") //localhost:8080/ryeon
public class PostController {

    // { "id" : "test", "password" : "1234" }
    @PostMapping(value = "/postOK")  //localhost:8080/ryeon/postOK
    public String postOK(@RequestBody Person data){
        System.out.println(data.getId());
        System.out.println(data.getPassword());
        return "ok~~~~!";
    }

    @PostMapping(value = "/postMethod") //localhost:8080/ryeon/postMethod
    public Person postMethod(@RequestBody Person data){
        return data;
    }
}
