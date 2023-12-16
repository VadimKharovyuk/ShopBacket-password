package com.example.ch7_javasky.modelDTO;

public class Country {
    private String name ;
    private long popular;

    public static  Country of (String name, long population){
        Country country = new Country();
        country.setName(name);
        country.setPopular(population);
        return country ;
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopular() {
        return popular;
    }

    public void setPopular(long popular) {
        this.popular = popular;
    }
}
