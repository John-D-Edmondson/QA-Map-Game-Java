package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BlobbyMonsterTest {

    @Test
    public void testGreeting() {
        // Arrange
        int x = 5;
        int y = 10;
        BlobbyMonster monster = new BlobbyMonster(x, y);

        // Capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Act
        monster.greeting();

        // Restore original output
        System.setOut(originalOut);

        String expectedOutput = "Monster at (5, 10): Blobbly blobbly! I'm a blob!";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
