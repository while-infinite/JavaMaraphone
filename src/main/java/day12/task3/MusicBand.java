package day12.task3;

import java.util.ArrayList;
import java.util.List;


public class MusicBand {
    private String name;
    private int year;


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "MusicBand: {" + name + ',' + year + '}';
    }
}
