package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GreenMonsterTest {

    @Test
    public void testGreeting() {
        int x = 7;
        int y = 14;
        GreenMonster monster = new GreenMonster(x, y);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        monster.greeting();

        // Restore original output
        System.setOut(originalOut);

        // Assert
        String expectedOutput = "Monster at (7, 14): I'm a green beast!";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
