package com.example.ch7_javasky.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {
    private String name ;
    private String password;
    public boolean login(){
        String userName = getName();
        String password = getPassword();
        if ("vadim".equals(userName)&& "19111993".equals(password)){
            return true;
        }else {
            return false;
        }

    }

}
