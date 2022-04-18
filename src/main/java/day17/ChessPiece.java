package day17;

public enum ChessPiece {
    KING_WHITE(100, "БЕЛЫЙ КОРОЛЬ"), KING_BLACK(100, "ЧЁРНЫЙ КОРОЛЬ"), QUEEN_WHITE(9,"БЕЛЫЙ ФЕРЗЬ"),
    QUEEN_BLACK(9,"ЧЁРНЫЙ ФЕРЗЬ"), ROOK_WHITE(5,"БЕЛАЯ ЛАДЬЯ"), ROOK_BLACK(5,"ЧЁРНАЯ ЛАДЬЯ"),
    PAWN_WHITE(1,"БЕЛАЯ ПЕШКА"), PAWN_BLACK(1,"ЧЁРНАЯ ПЕШКА"), BISHOP_WHITE(3.5,"БЕЛЫЙ СЛОН"),
    BISHOP_BLACK(3.5,"ЧЁРНЫЙ СЛОН"), HORSE_WHITE(3,"БЕЛЫЙ КОНЬ"), HORSE_BLACK(3,"ЧЁРНЫЙ КОНЬ"),
    EMPTY(-1,"_");

    private int value;
    private double value2;
    private String name;


    ChessPiece(int value, String name){
        this.name = name;
        this.value = value;
    }
    ChessPiece(double value2, String name){
        this.name = name;
        this.value2 = value2;
    }

    public String getName() {
        return name;
    }
}
