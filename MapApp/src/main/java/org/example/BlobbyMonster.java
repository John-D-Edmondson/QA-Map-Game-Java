package org.example;

public class BlobbyMonster extends Monster {
    public BlobbyMonster(int x, int y) {
        super(x, y);
    }

    @Override
    public void greeting() {
        System.out.println("Monster at (" + getLocation()[0] + ", " + getLocation()[1] + "): Blobbly blobbly! I'm a blob!");
    }
}
