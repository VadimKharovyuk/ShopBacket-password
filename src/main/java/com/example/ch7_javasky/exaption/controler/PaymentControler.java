package com.example.ch7_javasky.exaption.controler;

import com.example.ch7_javasky.exaption.ErrorDetalis;
import com.example.ch7_javasky.exaption.PaymentDetalis;
import com.example.ch7_javasky.exaption.exaption.NotEnougtMoneyExaption;
import com.example.ch7_javasky.exaption.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentControler {
    private final PaymentService paymentService ;

    public PaymentControler(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @GetMapping("/payment")
    public ResponseEntity <?> makePayment (){
        try {
            PaymentDetalis paymentDetalis = paymentService.proccesPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetalis);

        }catch (NotEnougtMoneyExaption e ){
            ErrorDetalis errorDetalis = new ErrorDetalis();
            errorDetalis.setMesage("Не хватает денег для покупки");
            return ResponseEntity
                    .badRequest()
                    .body(errorDetalis);
        }

    }
}
