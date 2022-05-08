package com.imran.snakeladder;

public class Snake {

    private int start,end;

    public Snake(int start,int end)
    {
        this.start = start;
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public boolean isSnakeHead(int pos)
    {
        return this.start == pos;
    }
}
