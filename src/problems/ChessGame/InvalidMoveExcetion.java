package problems.ChessGame;

public class InvalidMoveExcetion extends RuntimeException {
    public InvalidMoveExcetion(final String msg) {
        super(msg);
    }
}
