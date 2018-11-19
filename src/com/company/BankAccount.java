package com.company;

public class BankAccount {
    private String name;
    private double count;
    private static double bankmoney=0;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    //0.5%
    public void add(double money) {
        bankmoney=bankmoney+money*0.005;
        money=money*0.995;
        this.count=this.count+money;
    }

    //1%
    public void transfer(BankAccount otherPerson, double money) {
        if(money>this.count){
            throw new IllegalArgumentException("you don`t have enough money on your account");
        }
        bankmoney=bankmoney+money*0.01;
        money=money*0.99;
        otherPerson.count=otherPerson.count+money;
        this.count=this.count-money;

    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public static double getBankmoney() {
        return bankmoney;
    }
    //director and 3 employes,10% 15% 20% how much money have employes and a bank

}
