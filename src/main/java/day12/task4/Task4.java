package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Serj Trkanian");
        members1.add("Daron Malakian");
        members1.add("Shavo Odajian");

        List<MusicBand> Band1 = new ArrayList<>();
        Band1.add(new MusicBand("System of a down", 1992, members1));


        List<String> members2 = new ArrayList<>();
        members2.add("Endy Hachatrian");
        members2.add("Jon Dolamian");


        List<MusicBand> Band2 = new ArrayList<>();
        Band2.add(new MusicBand("SOAD", 1992, members2));

        MusicBand.transferMembers(Band1.get(0), Band2.get(0));


        for (String list : Band2.get(0).getMembers()) {
            System.out.println(list);
        }
        System.out.println('\n');

        for (String list : Band1.get(0).getMembers()) {
            System.out.println(list);
        }


    }
}
