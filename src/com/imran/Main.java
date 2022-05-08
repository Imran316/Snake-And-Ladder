package com.imran;

import com.imran.snakeladder.Entities;
import com.imran.snakeladder.GameService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities entities = Entities.getInstance();

        Integer noOfPlayers = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noOfPlayers;i++)
        {
            String name = sc.next();
            entities.addPlayer(name);
        }
        sc.nextLine();

        Integer noOfLadders = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noOfLadders;i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            entities.addLadder(start,end);
            sc.nextLine();
        }

        Integer noOfSnakes = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noOfSnakes;i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            sc.nextLine();
            entities.addSnake(start,end);
        }

        Integer diceSide = sc.nextInt();
        entities.setDice(diceSide);
        sc.nextLine();

        Integer boardEnd = sc.nextInt();
        entities.setBoardEnd(boardEnd);
        sc.nextLine();

        GameService gameService = new GameService();
        gameService.play();

    }
}

/*
*
*
*
2
Gaurav
Sagar
8
2 37
27 46
10 32
51 68
61 79
65 84
71 91
81 100
9
62 5
33 6
49 9
88 16
41 20
56 53
98 64
93 73
95 75
6
100

* */