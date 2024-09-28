package problems.TicTacToeGame;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class GameBoard {

    char[][] board;
    int boardSize;
    Queue<Player> queue;
    Scanner input;

    public GameBoard(int boardSize, Player[] players){
        this.boardSize =boardSize;
        this.board = new char[(2*boardSize)-1][(2*boardSize)-1];
        initializeBoard(boardSize);
        queue = new LinkedList<>();
        for(int i=0;i<players.length;i++){
            queue.offer(players[i]);
        }

        input =new Scanner(System.in);
    }

    private void initializeBoard(int boardSize) {
        int n = 2*boardSize-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0 && j%2!=0) board[i][j] = '|';
                else if(i%2!=0 && j%2==0) board[i][j] = '-';
                else if(i%2!=0 && j%2!=0) board[i][j] = '+';
                else board[i][j] = ' ';
            }
        }
    }
    public void printBoard(){
        for(char[] row: board){
            for(char col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public void startGame(){
        int count =0;
        int maxMovesallowed = boardSize*boardSize;
        System.out.println("LET'S START THE GAME");
//        System.out.println(board);
        printBoard();
        while(true){
            if(count==maxMovesallowed){
                System.out.println("-------GAME DRAW-------");
                return;
            }
            Player player = queue.poll();
            int[] pos = getUserInput(player);
            board[pos[0]][pos[1]] = player.getPlayerSymbol();
            System.out.println("Board After the move");
            printBoard();
            if(count>=boardSize && checkWinner(player)){
                System.out.println(player.getPlayerName() + " -----WON THE GAME-------");
                break;
            }
            queue.offer(player);
            count++;
        }
    }
    public int[] getUserInput(Player player){
        int[] pos = new int[2];

        System.out.print( player.getPlayerName() +" Enter the Position X and Y on the Board : ");

        pos[0] = input.nextInt();
        pos[1] = input.nextInt();
        while(!validPosition(pos)){
            System.out.println("----INVALID POSITION----");
            return getUserInput(player);
        }
        pos[0] = 2*(pos[0]-1);
        pos[1] = 2*(pos[1]-1);
        return pos;
    }
    private boolean checkWinner(Player player) {
        int count=0;
        int n = 2*boardSize-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==player.getPlayerSymbol()) count++;
                if(count==boardSize)return true;
            }
            count =0;
        }
        count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[j][i]==player.getPlayerSymbol()) count++;
                if(count==boardSize)return true;
            }
            count=0;
        }
        int i=0, j=0;
        count=0;
        while(i<n && j<n){
            if(board[i][j]==player.getPlayerSymbol())count++;
            if(count==boardSize)return true;
            i++;
            j++;
        }
        i=n-1;
        j=0;
        count =0;
        while(i>=0 &&j<n){
            if(board[i][j]==player.getPlayerSymbol())count++;
            if(count==boardSize)return true;
            i--;
            j++;
        }
        return false;
    }



    private boolean validPosition(int[] pos) {
        int x = pos[0];
        int y = pos[1];
        if(x>=1 && x<=boardSize && y>=1 && y<=boardSize &&
                !(board[2*(x-1)][2*(y-1)]=='X' || board[2*(x-1)][2*(y-1)]=='O'))return true;
        return false;
    }
}
