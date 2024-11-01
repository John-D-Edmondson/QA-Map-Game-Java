package mapclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MapTest {

    @Test
    void testUpdateMapWithValidPosition() {
        Map map = new Map(5, 5);
        int[] playerPos = {2, 3};
        map.updateMap(playerPos);
        char[][] expectedMap = {
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', 'P', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'}
        };

        for (int i = 0; i < 5; i++) {
            assertArrayEquals(expectedMap[i], map.getMap()[i]);
        }
    }

    @Test
    void testUpdateMapWithOutOfBoundsPosition() {
        Map map = new Map(5, 5);
        int[] playerPos = {5, 5}; // Out of bounds
        try {
            map.updateMap(playerPos);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Test passes
        }
    }

    @Test
    void testUpdateMapWithNegativePosition() {
        Map map = new Map(5, 5);
        int[] playerPos = {-1, -1}; // Negative position
        try {
            map.updateMap(playerPos);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Test passes
        }
    }

    @Test
    void testUpdateMapWithBoundaryPosition() {
        Map map = new Map(5, 5);
        int[] playerPos = {4, 4}; // Boundary position
        map.updateMap(playerPos);
        char[][] expectedMap = {
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', 'P'}
        };

        for (int i = 0; i < 5; i++) {
            assertArrayEquals(expectedMap[i], map.getMap()[i]);
        }
    }

    @Test
    void testUpdateMapWithMultipleUpdates() {
        Map map = new Map(5, 5);
        int[] playerPos1 = {1, 1};
        int[] playerPos2 = {2, 2};
        map.updateMap(playerPos1);
        map.updateMap(playerPos2);

        char[][] expectedMap = {
                {'.', '.', '.', '.', '.'},
                {'.', 'P', '.', '.', '.'},
                {'.', '.', 'P', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.'}
        };

        for (int i = 0; i < 5; i++) {
            assertArrayEquals(expectedMap[i], map.getMap()[i]);
        }
    }
}
