package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] arrChess = new ChessPiece[8][8];
        for(int i = 0; i < arrChess.length; i++)
            Arrays.fill(arrChess[i], ChessPiece.EMPTY);

        arrChess[0][0] = ChessPiece.ROOK_BLACK;
        arrChess[0][5] = ChessPiece.ROOK_BLACK;
        arrChess[0][6] = ChessPiece.KING_BLACK;
        arrChess[1][1] = ChessPiece.ROOK_WHITE;
        arrChess[1][4] = ChessPiece.PAWN_BLACK;
        arrChess[1][5] = ChessPiece.PAWN_BLACK;
        arrChess[1][7] = ChessPiece.PAWN_BLACK;
        arrChess[2][0] = ChessPiece.PAWN_BLACK;
        arrChess[2][2] = ChessPiece.HORSE_BLACK;
        arrChess[2][6] = ChessPiece.PAWN_BLACK;
        arrChess[3][0] = ChessPiece.QUEEN_BLACK;
        arrChess[3][3] = ChessPiece.BISHOP_WHITE;
        arrChess[4][3] = ChessPiece.BISHOP_BLACK;
        arrChess[4][4] = ChessPiece.PAWN_WHITE;
        arrChess[5][4] = ChessPiece.BISHOP_WHITE;
        arrChess[5][5] = ChessPiece.PAWN_WHITE;
        arrChess[6][0] = ChessPiece.PAWN_WHITE;
        arrChess[6][3] = ChessPiece.QUEEN_WHITE;
        arrChess[6][5] = ChessPiece.PAWN_WHITE;
        arrChess[6][7] = ChessPiece.PAWN_WHITE;
        arrChess[7][5] = ChessPiece.ROOK_WHITE;
        arrChess[7][6] = ChessPiece.KING_WHITE;

        ChessBoard board = new ChessBoard(arrChess);
        board.Print();

    }
}
