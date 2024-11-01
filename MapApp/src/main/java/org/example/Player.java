package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Player {
    int xLoc;
    int yLoc;
    Random rn = new Random();

    public Player(int mapX, int mapY) {
        this.xLoc = rn.nextInt(mapX);
        this.yLoc = rn.nextInt(mapY);
    }

    public int[] getPlayerLoc() {
        return new int[]{xLoc, yLoc};
    }

    boolean checkLocation(ArrayList<Monster> monsters, Treasure treasure) {
        System.out.println("Player is currently @ " + Arrays.toString(getPlayerLoc()));
        for (Monster monster: monsters) {
            if (Arrays.equals(getPlayerLoc(), monster.getLocation())){
                monster.greeting();
                System.out.println("You have encountered a monster");
                return false;
            }
        }

        if (Arrays.equals(getPlayerLoc(), treasure.getLocation())) {
            System.out.println("You've found the treasure!!!");
            return false;
        }

        System.out.println("You can keep playing; you have not encountered monsters or the treasure");
        return true;

    }

    String distanceToTreasure(int[] treasureLoc) {
        int treasureX = treasureLoc[0];
        int treasureY = treasureLoc[1];
        int distX = treasureX - xLoc;
        int distY = treasureY - yLoc;
        return "Distance to Treasure is X: " + distX + ", Y: " + distY;
    }

    public void move(String direction) {
        int[] pLocation = getPlayerLoc();
        switch (direction) {
            case "8":
                pLocation[0]++;
                break;
            case "6":
                pLocation[1]++;
                break;
            case "4":
                pLocation[1]--;
                break;
            case "2":
                pLocation[0]--;
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }
    }
}
