package com.imran.snakeladder;

import java.util.Random;

public class Dice {

    private int side;
    private Random random;

    public Dice(int side)
    {
        this.side = side;
        random = new Random();
    }

    public int getNext()
    {
        return (random.nextInt(1000) % this.side + 1);
    }
}
