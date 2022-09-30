package com.example.Jpa.controller;


import com.example.Jpa.model.test.Data;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/RYEON")
    public class test {

        //localhost:8080/RYEON/getRequest
        @RequestMapping(method = RequestMethod.GET, path = "/getRequest")
        public String getRequest(){
            return "안녕하세요. 안세련입니다~~!!";
        }

        @GetMapping("/getParameter") //localhost:8080/RYEON/getParameter?id=aaa&password=123456
        public String getParameter(@RequestParam String id, @RequestParam String password){
            System.out.println("id : " + id);
            System.out.println("password : " + password);
            return "입력하신 아이디는" + id + ", 비밀번호는" + password;
        }

        //localhost:8080/RYEON/getMultiParam?id=ryeon&password=123456&age=25&address=관악구
        @GetMapping("/getMultiParam")
        public void getMultiParam(Data d){
            System.out.println(d);
            System.out.println(d.toString());
            System.out.println(d.getId());
            System.out.println(d.getPassword());
            System.out.println(d.getAge());
            System.out.println(d.getAddress());
        }
    }

