package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] cp = new ChessPiece[8];
        cp[0] = ChessPiece.PAWN_WHITE;
        cp[1] = ChessPiece.PAWN_WHITE;
        cp[2] = ChessPiece.PAWN_WHITE;
        cp[3] = ChessPiece.PAWN_WHITE;
        cp[4] = ChessPiece.ROOK_BLACK;
        cp[5] = ChessPiece.ROOK_BLACK;
        cp[6] = ChessPiece.ROOK_BLACK;
        cp[7] = ChessPiece.ROOK_BLACK;

        for (ChessPiece chess : cp) {
            System.out.print(chess.name() + ',' + " ");
        }
       System.out.println(cp[0].getValue());
    }
}