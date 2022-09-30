package com.example.Jpa.controller;

import com.example.Jpa.model.test.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ryeon")  //localhost:8080/ryeon
public class GetController {

    @RequestMapping(method = RequestMethod.POST, path = "/getHi") //localhost:8080/ryeon/getHi
    public String getHi(){

        return "Hi getMethod";
    }

    @GetMapping("/getHello")  //localhost:8080/ryeon/getHello?id=test&password=1234
    public String getHello(@RequestParam String id, @RequestParam String password){
        System.out.println("id : " + id);
        System.out.println("password :" + password);
        return id + password;
    }

    @GetMapping("/getData") //localhost:8080/ryeon/getData?id=test&password=1234
    public Person getData(Person data){
        System.out.println(data.getId());
        System.out.println(data.getPassword());
        // { "id" : "test", "password" : "1234" } JSON기법
        return  data;
    }
}
