package com.example.ch7_javasky.exaption.service;

import com.example.ch7_javasky.exaption.PaymentDetalis;
import com.example.ch7_javasky.exaption.exaption.NotEnougtMoneyExaption;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetalis  proccesPayment (){
        throw new NotEnougtMoneyExaption();
    }
}
