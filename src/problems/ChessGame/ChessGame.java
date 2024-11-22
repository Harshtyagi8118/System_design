package problems.ChessGame;

import problems.ChessGame.Pieces.Piece;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChessGame {
    private final Board board;
    private final Player[] players;
    private int currentPlayer;

    public ChessGame() {
        this.board = new Board();
        this.players = new Player[]{new Player(Color.WHITE), new Player(Color.BLACK)};
        currentPlayer = 0;
    }
    public void start(){
        while(!isGameOver()){
            Player player = players[currentPlayer];
            System.out.println(player.getColor() + "'s turn.");
            
            Move move = getPlayerMove(player);

            try{
                player.makeMove(board,move);
            }
            catch (InvalidMoveExcetion ex){
                System.out.println(ex.getMessage());
                System.out.println("Try Again...");
                continue;
            }
            currentPlayer = (currentPlayer+1)%2;
            
        }
        displayResult();
    }

    private void displayResult() {
        if(board.isCheckMate(Color.WHITE)){
            System.out.println("Black wins by checkmate");
        }
        else if(board.isCheckMate(Color.BLACK)){
            System.out.println("White wins by checkmate");
        }
        else if(board.isStaleMate(Color.WHITE) || board.isStaleMate(Color.BLACK)){
            System.out.println("The Game ends in a SaleMate");
        }
    }

    private Move getPlayerMove(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source row : ");
        int srcRow = scanner.nextInt();
        System.out.print("Enter source col : ");
        int srcCol = scanner.nextInt();
        System.out.print("Enter destination row : ");
        int destRow = scanner.nextInt();
        System.out.print("Enter destination col : ");
        int destcol = scanner.nextInt();
        Piece piece = board.getPiece(srcRow,srcCol);
        if(piece == null || player.getColor()!=piece.getColor()){
            throw new InvalidMoveExcetion("Invalid Piece Selection...");
        }
        return new Move(piece,destRow,destcol);
    }

    private boolean isGameOver() {
        return (board.isCheckMate(players[0].getColor()) || board.isCheckMate(players[1].getColor()) ||
                board.isStaleMate(players[0].getColor()) || board.isStaleMate(players[0].getColor()));
    }
}
