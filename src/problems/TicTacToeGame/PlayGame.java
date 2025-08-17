package problems.TicTacToeGame;

import java.util.ArrayList;

public class  PlayGame {
    public void run(){
        Player[] players = new Player[2] ;
        Player player1 = new Player();
        player1.setPlayerName("Harsh");
        player1.setPlayerSymbol('X');
        player1.setPlayerId(1);
        player1.setPlayerAddress("Bangalore");
        player1.setPlayerRank(2);

        Player player2 = new Player();
        player2.setPlayerName("Tyagi");
        player2.setPlayerSymbol('O');
        player2.setPlayerId(2);
        player2.setPlayerAddress("Chennai");
        player2.setPlayerRank(1);

        players[0] = player1;
        players[1] = player2;
        GameBoard gb = new GameBoard(3, players);
        gb.startGame();

    }
}
