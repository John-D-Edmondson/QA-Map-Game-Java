package mapclass;

import org.example.Monster;

import java.util.ArrayList;

public class Map {
    public char[][] getMap() {
        return map;
    }

    private char[][] map;




    public Map(int x, int y) {
        map = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                map[i][j] = '.';
            }
        }
    }

    public void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void updateMap (int[] playPos){
        int x = playPos[0];
        int y = playPos[1];
        map[x][y] = 'P';
    }

    public void addMonster(ArrayList<Monster> monsters){
        for (Monster monster: monsters) {
            int[] monPos = monster.getLocation();
            int x = monPos[0];
            int y = monPos[1];

            map[x][y] = 'M';

        }
    }
}
