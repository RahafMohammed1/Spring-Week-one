package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @RequestMapping("/name")
    String GetName(){
        return "My name is Rahaf";
    }

    @RequestMapping("/age")
    String GetAge(){
        return "My age is 23";
    }

    @RequestMapping("/check/status")
    String GetStatus(){
        return "“Everything OK”";
    }
    @RequestMapping("/health")
    String GetHealth(){
        return "“Server health is up and running”";
    }
    @RequestMapping("/names")
    String[] GetNames(){
        String a[]={"Rahaf","Afnan","Maram"};
        return a;
    }


}
