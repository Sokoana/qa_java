package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
   private Feline feline;/*переменная для инъекции зависимостей - чтобы избежать привязки к
    классу Feline напрямую*/

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного " +
                    "- самей или самка");
        }
        this.feline = feline;

    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}