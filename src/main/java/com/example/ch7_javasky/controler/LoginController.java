package com.example.ch7_javasky.controler;

import com.example.ch7_javasky.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor ;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }
    @GetMapping("/")
    public String loginSet(){
        return "login.html" ;
    }
    @PostMapping("/")
    public String postinSet(
            @RequestParam String  username ,
            @RequestParam String  password ,
            Model model
    ) {
        loginProcessor.setName(username);
        loginProcessor.setPassword(password);
        boolean loggerIn = loginProcessor.login();
        if (loggerIn){
            model.addAttribute("message","Вы зарегистрировались ");
        }else {
            model.addAttribute("message","Пароль не верный") ;
        }
        return "login.html" ;

    }

}
