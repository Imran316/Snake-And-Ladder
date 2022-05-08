package com.imran.snakeladder;

import java.util.ArrayList;
import java.util.List;

public class Entities {

    private Entities()
    {

    }

    private List<Player> players = new ArrayList<>();
    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();
    private Dice dice;
    private int boardEnd;

    public static Entities instance = new Entities();

    public static Entities getInstance()
    {
        return instance;
    }

    public void addPlayer(String name)
    {
        players.add(new Player(name));
    }

    public void addSnake(int start,int end)
    {
        snakes.add(new Snake(start,end));
    }

    public void addLadder(int start,int end)
    {
        ladders.add(new Ladder(start,end));
    }

    public void setDice(int side)
    {
        dice = new Dice(side);
    }

    public void setBoardEnd(int boardEnd) {
        this.boardEnd = boardEnd;
    }

    public Dice getDice() {
        return dice;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public Snake getSnakeStart(int position)
    {
        Snake snake = snakes.stream().filter(x-> x.isSnakeHead(position)).findFirst().orElse(null);
        return snake;
    }

    public Ladder getLadderStart(int position)
    {
        Ladder ladder = ladders.stream().filter(x-> x.isLadderStart(position)).findFirst().orElse(null);
        return ladder;
    }

    public int getBoardEnd() {
        return boardEnd;
    }
}
