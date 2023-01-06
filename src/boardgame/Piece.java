package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();


    //Concrete method using abstract method, its call "Hook Method"
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()]
    }


    //Concrete implementation depending on an abstract method
     public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
         for (int i = 0; i < mat.length; i++) {
             for (int j = 0; j < mat.length; j++) {
                 if (mat[i][j]){
                     return true;
                 }
             }
         }
        return false;
     }


}
