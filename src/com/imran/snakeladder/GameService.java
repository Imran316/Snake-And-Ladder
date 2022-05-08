package com.imran.snakeladder;

public class GameService {

    public void play()
    {
        Entities entities = Entities.getInstance();
        int playerChance = 0;
        boolean win = false;
        System.out.println("Game is started and must land on "+ entities.getBoardEnd());
        Player player = null;
        while(!win)
        {
            player = entities.getPlayers().get(playerChance);
            playerChance = (playerChance+1) % entities.getPlayers().size();

            int steps = entities.getDice().getNext();
            int oldStep = player.getCurrentPostion();
            int newStep = player.getCurrentPostion() + steps;

            Snake snake = entities.getSnakeStart(newStep);
            Ladder ladder = entities.getLadderStart(newStep);

            if(null != snake) {
                player.setCurrentPostion(snake.getEnd());
                System.out.println("Player: "+ player.getName() + " "+ oldStep + " got Eatten by snake and went down on "+ player.getCurrentPostion());
            }
            else if (null != ladder)
            {
                player.setCurrentPostion(ladder.getEnd());
                System.out.println("Player: "+ player.getName() + " "+ oldStep + " got ladder upto "+ player.getCurrentPostion());
            }
            else if(newStep <= entities.getBoardEnd())
            {
                player.setCurrentPostion(newStep);
                System.out.println("Player: "+ player.getName() + " "+ oldStep + " landed on "+ player.getCurrentPostion());
            }


            if(player.getCurrentPostion() == entities.getBoardEnd())
                win = true;
        }

        System.out.println(player.getName() + " Wins the Game");
    }
}
