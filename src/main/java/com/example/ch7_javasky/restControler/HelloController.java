package com.example.ch7_javasky.restControler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {
//    //case 1  //@Controller  обязательно  @ResponseBody

//    @GetMapping ("/hello")
//    @ResponseBody
//    public String name (){
//        return "hello Vadim" ;
//    }
////
//    @GetMapping ("/goodbye")
//    @ResponseBody
//    public String goodbye (){
//        return "goodbye Vadim" ;
//    }
        @GetMapping ("/hello")
    public String name (){
        return "hello Vadim" ;
    }

    @GetMapping ("/goodbye")
    public String goodbye (){
        return "goodbye Vadim" ;
    }

}
