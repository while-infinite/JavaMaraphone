package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artist1 = new ArrayList<>();
        artist1.add(new MusicArtist("Serj Trkanian", 45));
        artist1.add(new MusicArtist("Daron Malakian", 47));
        artist1.add(new MusicArtist("Shavo Odajian", 48));

        List<MusicBand> band1 = new ArrayList<>();
        band1.add(new MusicBand("System of a down", 1992, artist1));

        List<MusicArtist> artist2 = new ArrayList<>();
        artist2.add(new MusicArtist("Endy Hachatrian", 50));
        artist2.add(new MusicArtist("Jon Dolamian", 49));

        List<MusicBand> band2 = new ArrayList<>();
        band2.add(new MusicBand("SOAD", 1992, artist2));

        for (MusicArtist list : band1.get(0).getMembers()) {
            System.out.println(list);
        }
        System.out.println('\n');
        for (MusicArtist list : band2.get(0).getMembers()) {
            System.out.println(list);
        }
        System.out.println('\n');

        MusicBand.transferMembers(band1.get(0), band2.get(0));

        for (MusicArtist list : band2.get(0).getMembers()) {
            System.out.println(list);
        }



    }
}
