package com.imran.snakeladder;

public class Ladder {
    private int start,end;

    public Ladder(int start,int end)
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

    public boolean isLadderStart(int pos)
    {
        return pos == this.start;
    }
}
