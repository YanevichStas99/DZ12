package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        TimeSpan timeSpan1 = new TimeSpan(5, 30);
        TimeSpan timeSpan2 = new TimeSpan(2, 15);
        TimeSpan timeSpan3 = new TimeSpan(4, 55);
        timeSpan1.add(timeSpan2);
        System.out.println(timeSpan1);
        timeSpan1.sub(timeSpan3);
        System.out.println(timeSpan1);
        timeSpan1.mult(3);
        System.out.println(timeSpan1);

        TimeSpan asdf = new TimeSpan(1, 30);
        asdf.mult(0.5);
        System.out.println("asdf" + asdf);



        System.out.println("Task 2");
        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);
        boss.add(100000);
        boss.transfer(ivan, 10000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);
        System.out.println(boss.getCount());
        System.out.println(ivan.getCount());
        System.out.println(alex.getCount());
        System.out.println(sergey.getCount());
        System.out.println(BankAccount.getBankmoney());
        System.out.println("Task 3");
        Object object1 = new Object(15, 60);
        Object object2 = new Object(30, 90);
        Object object3 = new Object(50, 100);
        List<Object> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);
        Bag bag = new Bag(80);
        Collections.sort(objects, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return Double.compare(o1.getMassPrice(), o2.getMassPrice());
            }
        });
        System.out.println(Sortmaster.sortmaster(bag, objects));


    }
}
