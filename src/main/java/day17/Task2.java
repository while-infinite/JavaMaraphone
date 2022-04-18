package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] arrChess = new ChessPiece[8][8];
        arrChess[0][0] = ChessPiece.ROOK_BLACK;
        arrChess[0][1] = ChessPiece.EMPTY;
        arrChess[0][2] = ChessPiece.EMPTY;
        arrChess[0][3] = ChessPiece.EMPTY;
        arrChess[0][4] = ChessPiece.EMPTY;
        arrChess[0][5] = ChessPiece.ROOK_BLACK;
        arrChess[0][6] = ChessPiece.KING_BLACK;
        arrChess[0][7] = ChessPiece.EMPTY;
        arrChess[1][0] = ChessPiece.EMPTY;
        arrChess[1][1] = ChessPiece.ROOK_WHITE;
        arrChess[1][2] = ChessPiece.EMPTY;
        arrChess[1][3] = ChessPiece.EMPTY;
        arrChess[1][4] = ChessPiece.PAWN_BLACK;
        arrChess[1][5] = ChessPiece.PAWN_BLACK;
        arrChess[1][6] = ChessPiece.EMPTY;
        arrChess[1][7] = ChessPiece.PAWN_BLACK;
        arrChess[2][0] = ChessPiece.PAWN_BLACK;
        arrChess[2][1] = ChessPiece.EMPTY;
        arrChess[2][2] = ChessPiece.HORSE_BLACK;
        arrChess[2][3] = ChessPiece.EMPTY;
        arrChess[2][4] = ChessPiece.EMPTY;
        arrChess[2][5] = ChessPiece.EMPTY;
        arrChess[2][6] = ChessPiece.PAWN_BLACK;
        arrChess[2][7] = ChessPiece.EMPTY;
        arrChess[3][0] = ChessPiece.QUEEN_BLACK;
        arrChess[3][1] = ChessPiece.EMPTY;
        arrChess[3][2] = ChessPiece.EMPTY;
        arrChess[3][3] = ChessPiece.BISHOP_WHITE;
        arrChess[3][4] = ChessPiece.EMPTY;
        arrChess[3][5] = ChessPiece.EMPTY;
        arrChess[3][6] = ChessPiece.EMPTY;
        arrChess[3][7] = ChessPiece.EMPTY;
        arrChess[4][0] = ChessPiece.EMPTY;
        arrChess[4][1] = ChessPiece.EMPTY;
        arrChess[4][2] = ChessPiece.EMPTY;
        arrChess[4][3] = ChessPiece.BISHOP_BLACK;
        arrChess[4][4] = ChessPiece.PAWN_WHITE;
        arrChess[4][5] = ChessPiece.EMPTY;
        arrChess[4][6] = ChessPiece.EMPTY;
        arrChess[4][7] = ChessPiece.EMPTY;
        arrChess[5][0] = ChessPiece.EMPTY;
        arrChess[5][1] = ChessPiece.EMPTY;
        arrChess[5][2] = ChessPiece.EMPTY;
        arrChess[5][3] = ChessPiece.EMPTY;
        arrChess[5][4] = ChessPiece.BISHOP_WHITE;
        arrChess[5][5] = ChessPiece.PAWN_WHITE;
        arrChess[5][6] = ChessPiece.EMPTY;
        arrChess[5][7] = ChessPiece.EMPTY;
        arrChess[6][0] = ChessPiece.PAWN_WHITE;
        arrChess[6][1] = ChessPiece.EMPTY;
        arrChess[6][2] = ChessPiece.EMPTY;
        arrChess[6][3] = ChessPiece.QUEEN_WHITE;
        arrChess[6][4] = ChessPiece.EMPTY;
        arrChess[6][5] = ChessPiece.PAWN_WHITE;
        arrChess[6][6] = ChessPiece.EMPTY;
        arrChess[6][7] = ChessPiece.PAWN_WHITE;
        arrChess[7][0] = ChessPiece.EMPTY;
        arrChess[7][1] = ChessPiece.EMPTY;
        arrChess[7][2] = ChessPiece.EMPTY;
        arrChess[7][3] = ChessPiece.EMPTY;
        arrChess[7][4] = ChessPiece.EMPTY;
        arrChess[7][5] = ChessPiece.ROOK_WHITE;
        arrChess[7][6] = ChessPiece.KING_WHITE;
        arrChess[7][7] = ChessPiece.EMPTY;

        ChessBoard board = new ChessBoard(arrChess);
        board.Print();

    }
}
