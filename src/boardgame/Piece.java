package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    //Only classes and subclasses in the same package can access.
    protected Board getBoard() {
        return board;
    }
}
