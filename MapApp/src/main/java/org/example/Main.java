package org.example;

import mapclass.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new Map(2,3);
        map.printMap();
        System.out.println("=================");
        map.updateMap(1,1);
        map.printMap();
    }
}