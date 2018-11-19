package com.company;

import java.util.List;

import static java.util.Collections.list;

public class Sortmaster {
    public static String sortmaster(Bag bag, List<Object> list) {
        int count = 0;
        Object object = list.get(list.size() - 1);
        double mass = object.getMass();
        count = (int) (bag.getBagMass() / mass);


        return "object" + (list.size()) + ": " + count;
    }
}
