package com.example.demo.controller;

import com.example.demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

    @RequestMapping("/check")
    public String health(){
        System.out.println("App Working");
        return "App Working...";
    }

    // 1/2 this message mapping end point should be shared to source team
    // so that they will send JSON file to this end point.
    @MessageMapping("/hello")
    public void greeting(HelloMessage message) throws Exception {
        //System.out.println(message.getName());

    }
}
