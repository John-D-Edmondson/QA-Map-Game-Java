package org.example;

import java.util.Random;

public class Treasure {
    private int x;
    private int y;
    private static Random random = new Random(); // Random instance


    public Treasure(int maxX, int maxY) {
        this.x = random.nextInt(maxX + 1);
        this.y = random.nextInt(maxY + 1);
    }

    public int[] getLocation() {
        return new int[]{x, y};
    }

    public void describe() {
        System.out.println("org.example.Treasure is at (" + x + ", " + y + ")!");
    }
}
