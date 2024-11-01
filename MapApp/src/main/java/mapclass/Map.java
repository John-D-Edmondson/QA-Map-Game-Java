package mapclass;

public class Map {
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

    public void updateMap (int x, int y){
        map[x][y] =  'P';
    }
}
