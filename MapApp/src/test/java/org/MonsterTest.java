package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MonsterTest {

    @Test
    public void testMonsterLocationWithinBounds() {
        int maxX = 10;
        int maxY = 20;
        Monster monster = new Monster(maxX, maxY);

        int[] location = monster.getLocation();

        // String in first half is the message that gets displayed if the assertion is not true
        assertTrue("X coordinate should be within 0 and " + maxX, location[0] >= 0 && location[0] <= maxX);
        assertTrue("Y coordinate should be within 0 and " + maxY, location[1] >= 0 && location[1] <= maxY);
    }

    @Test
    public void testGreetingOutput() {
        int maxX = 5;
        int maxY = 10;
        Monster monster = new Monster(maxX, maxY);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        monster.greeting();

        System.setOut(originalOut);

        int[] location = monster.getLocation();
        String expectedOutput = "Monster at (" + location[0] + ", " + location[1] + "): Hello, adventurer!";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
