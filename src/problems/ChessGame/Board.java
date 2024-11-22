package problems.ChessGame;

import problems.ChessGame.Pieces.*;


public class Board {

    private final Piece[][] board;

    public Board() {
        this.board = new Piece[8][8];
        initialize();
    }
    void initialize(){

        // for white pieces
        board[0][0] = new Rook(Color.WHITE,0,0);
        board[0][1] = new Knight(Color.WHITE,0,1);
        board[0][2] = new Bishop(Color.WHITE,0,2);
        board[0][3] = new Queen(Color.WHITE,0,3);
        board[0][4] = new King(Color.WHITE,0,4);
        board[0][5] = new Bishop(Color.WHITE,0,5);
        board[0][6] = new Knight(Color.WHITE,0,6);
        board[0][7] = new Rook(Color.WHITE,0,7);
        for(int i=0;i<8;i++){
            board[1][i] = new Pawn(Color.WHITE,1,i);
        }
        // for Black pieces
        board[7][0] = new Rook(Color.BLACK,7,0);
        board[7][1] = new Knight(Color.BLACK,7,1);
        board[7][2] = new Bishop(Color.BLACK,7,2);
        board[7][3] = new Queen(Color.BLACK,7,3);
        board[7][4] = new King(Color.BLACK,7,4);
        board[7][5] = new Bishop(Color.BLACK,7,5);
        board[7][6] = new Knight(Color.BLACK,7,6);
        board[7][7] = new Rook(Color.BLACK,7,7);
        for(int i=0;i<8;i++){
            board[6][i] = new Pawn(Color.BLACK,6,i);
        }

    }
    public Piece getPiece(int row,int col){
        return board[row][col];
    }

    public void setPiece(int row,int col, Piece piece){
        board[row][col] = piece;
    }
    public boolean isValidMove(int destRow,int destCol, Piece piece){
        if(piece == null || destCol<0 || destCol>7 || destRow<0 || destRow>7){
            return false;
        }
        Piece destPiece = board[destRow][destCol];
        return ( (destPiece==null || destPiece.getColor()!= piece.getColor()) &&
                piece.canMove(this,destRow,destCol));
        
    }
    public boolean isCheckMate(Color color){
        //  TODO Implement checkMate logic
        return false;
    }
    public boolean isStaleMate(Color color){
        //  TODO Implement StaleMate logic
        return false;
    }

}
