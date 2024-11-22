package problems.ChessGame;

import problems.ChessGame.Pieces.Piece;

public class Player {

    private final Color color;
    public Player(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void makeMove(Board board,Move move){
        Piece piece = move.getPiece();
        int destRow = move.getDestRow();
        int destCol = move.getDestCol();
        if(board.isValidMove(destRow,destCol,piece)){
            int srcRow = piece.getRow();
            int srcCol = piece.getCol();
            board.setPiece(srcRow,srcCol,null);
            board.setPiece(destRow,destCol,piece);
            piece.setRow(destRow);
            piece.setCol(destCol);
        }else{
            throw new InvalidMoveExcetion("Invalid Move");
        }
    }
}
