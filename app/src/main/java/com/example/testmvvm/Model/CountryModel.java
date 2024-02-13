package com.example.testmvvm.Model;

public class CountryModel {
    String name,capital;
    int age;
    public CountryModel(String name,String capital,int age){
        this.name=name;
        this.capital=capital;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getCapital() {
        return capital;
    }

    public String getName() {
        return name;
    }
}