package com.imran.snakeladder;

public class Player {
    private String name;
    private int currentPostion = -1;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCurrentPostion(int currentPostion) {
        this.currentPostion = currentPostion;
    }

    public int getCurrentPostion() {
        return currentPostion;
    }
}
