package org.example;

import mapclass.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the nightmare\n Please enter the height of your map\n");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the width of your map");
        int y = scanner.nextInt();
        scanner.nextLine();

        Map map = new Map(x,y);

        map.printMap();

        Monster monster1 = new BlobbyMonster(x-1,y-1);
        Monster monster2 = new GreenMonster(x-1,y-1);

        ArrayList<Monster> monsters = new ArrayList<Monster>();

        monster1.greeting();
        monster2.greeting();



    }
}