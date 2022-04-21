package day17;

public enum ChessPiece {
    KING_WHITE(100d, "БЕЛЫЙ КОРОЛЬ"), KING_BLACK(100d, "ЧЁРНЫЙ КОРОЛЬ"), QUEEN_WHITE(9d,"БЕЛЫЙ ФЕРЗЬ"),
    QUEEN_BLACK(9d,"ЧЁРНЫЙ ФЕРЗЬ"), ROOK_WHITE(5d,"БЕЛАЯ ЛАДЬЯ"), ROOK_BLACK(5d,"ЧЁРНАЯ ЛАДЬЯ"),
    PAWN_WHITE(1d,"БЕЛАЯ ПЕШКА"), PAWN_BLACK(1d,"ЧЁРНАЯ ПЕШКА"), BISHOP_WHITE(3.5,"БЕЛЫЙ СЛОН"),
    BISHOP_BLACK(3.5,"ЧЁРНЫЙ СЛОН"), HORSE_WHITE(3d,"БЕЛЫЙ КОНЬ"), HORSE_BLACK(3d,"ЧЁРНЫЙ КОНЬ"),
    EMPTY(-1d,"_");

    private double value;
    private String name;


    ChessPiece(double value, String name){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
