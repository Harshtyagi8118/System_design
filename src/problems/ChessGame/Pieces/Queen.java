package problems.ChessGame.Pieces;

import problems.ChessGame.Board;
import problems.ChessGame.Color;

import static java.lang.Math.abs;

public class Queen extends Piece{

    public Queen(Color color, int row,int col){
        super(color, row,col);
    }
    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        return ((abs(destRow - row)) == abs(destCol-col) || (destRow==row || destCol==col));
    }
}
