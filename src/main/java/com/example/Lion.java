package com.example;

import java.util.List;

public class Lion {
    Animal animal = new Animal();
    boolean hasMane;
    private Predator predator;

    public Lion(String sex, Feline feline, boolean hasMane) throws Exception {
        this.hasMane = hasMane;
        this.predator = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return predator.eatMeat();

    }


}
