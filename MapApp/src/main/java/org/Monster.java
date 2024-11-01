public class Monster {
    private int x;
    private int y;

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getLocation() {
        return new int[]{x, y};
    }

    public void greeting() {
        System.out.println("Monster at (" + x + ", " + y + "): Hello, adventurer!");
    }

}
