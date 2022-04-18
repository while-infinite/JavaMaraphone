package day17;

public class ChessBoard {
    private ChessPiece[][] arrChess;

    public ChessBoard(ChessPiece[][] arrChess){
        this.arrChess = arrChess;
    }
    public void Print(){
        for(int i = 0; i < this.arrChess.length; i++) {
            for (int j = 0; j < this.arrChess[i].length; j++)
                System.out.print(this.arrChess[i][j].getName()+ " ");
            System.out.println('\n');
        }
    }
}
