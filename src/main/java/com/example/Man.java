package com.example;

/**
 * Created by bilalturk on 11.03.2016.
 */
public class Man {
    private String name;
    private int age;
    private  String hairColor;

    public Man(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
}
