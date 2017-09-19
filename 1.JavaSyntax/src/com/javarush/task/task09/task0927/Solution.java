package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Cat1", new Cat ("Bars1"));
        cats.put("Cat2", new Cat ("Bars2"));
        cats.put("Cat3", new Cat ("Bars3"));
        cats.put("Cat4", new Cat ("Bars4"));
        cats.put("Cat5", new Cat ("Bars5"));
        cats.put("Cat6", new Cat ("Bars6"));
        cats.put("Cat7", new Cat ("Bars7"));
        cats.put("Cat8", new Cat ("Bars8"));
        cats.put("Cat9", new Cat ("Bars9"));
        cats.put("Cat10", new Cat ("Bars10"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> cats = new HashSet<>();
        for(Cat cat:map.values()){
            cats.add(cat);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
