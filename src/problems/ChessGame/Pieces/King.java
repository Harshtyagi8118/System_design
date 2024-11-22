package problems.ChessGame.Pieces;

import problems.ChessGame.Board;
import problems.ChessGame.Color;

import static java.lang.Math.abs;

public class King extends Piece{

    public King(Color color, int row, int col){
        super(color, row,col);
    }
    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        return (abs(destRow-row)<=1 && abs(destCol-col)<=1);
    }
}
