package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Serj Trkanian");
        members1.add("Daron Malakian");
        members1.add("Shavo Odajian");

        List<MusicBand> band1 = new ArrayList<>();
        band1.add(new MusicBand("System of a down", 1992, members1));


        List<String> members2 = new ArrayList<>();
        members2.add("Endy Hachatrian");
        members2.add("Jon Dolamian");


        List<MusicBand> band2 = new ArrayList<>();
        band2.add(new MusicBand("SOAD", 1992, members2));

        MusicBand.transferMembers(band1.get(0), band2.get(0));


        for (String list : band2.get(0).getMembers()) {
            System.out.println(list);
        }
        System.out.println('\n');

        for (String list : band1.get(0).getMembers()) {
            System.out.println(list);
        }


    }
}
