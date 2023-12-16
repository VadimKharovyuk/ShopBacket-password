package com.example.ch7_javasky.restControler;

import com.example.ch7_javasky.modelDTO.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
public class CountryController {
//    @GetMapping("/france")
//    public Country france(){
//        Country country =Country.of("France",67);
//        return country;
//    }
    @GetMapping("/italy")
    public Country italy(){
        Country country =Country.of("Italy",33);
        return country;
    }
    @GetMapping("/france")
    public ResponseEntity <Country> paris(){
        Country c =Country.of("france",67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED).
                header("capital","Paris")
                .header("favorite_food","chisse and vine")
                .header("continent","Europe")
                .body(c) ;


    }


    @GetMapping("/all")
    public List<Country> all(){
        Country country1 =Country.of("China",67);
        Country country2 =Country.of("Spain",44);
        Country country3 =Country.of("Ukraine",48);
        return List.of(country2,country1,country3);
    }
}
