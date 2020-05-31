package com.example.icecreamadviser.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamExpert {

    private Map<String, List<String>> iceCreamFlavours = initFlavourMap();

    private Map<String, List<String>> initFlavourMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Fruit", new ArrayList<>(Arrays.asList("Strawberry", "Mango", "Raspberry")));
        map.put("Cookie", new ArrayList<>(Arrays.asList("Biscuit", "Cookies")));
        map.put("Chocolate", new ArrayList<>(Arrays.asList("Chocolate chip", "Double chocolate", "Chocolate coffee")));
        map.put("Yogurt", new ArrayList<>(Arrays.asList("Wild berry yogurt", "Plain yogurt")));
        map.put("Cake", new ArrayList<>(Arrays.asList("Chantilly", "Cheesecake", "Chocolate chip cookie dough")));
        return map;
    }

    public List<String> getIceCreamFlavours(String type) {
        if (iceCreamFlavours.containsKey(type)) {
            return iceCreamFlavours.get(type);
        }
        return new ArrayList<>();
    }
}
