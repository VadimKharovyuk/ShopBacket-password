package com.example.ch7_javasky.restControler;

import com.example.ch7_javasky.modelDTO.Country;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france(){
        Country country =Country.of("France",67);
        return country;
    }
    @GetMapping("/all")
    public List<Country> all(){
        Country country1 =Country.of("China",67);
        Country country2 =Country.of("Spain",44);
        Country country3 =Country.of("Ukraine",48);
        return List.of(country2,country1,country3);
    }
}
