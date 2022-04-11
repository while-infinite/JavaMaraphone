package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> mus) {
        List<MusicBand> sortMus = new ArrayList<>();
        sortMus.addAll(mus);
        for (int i = 0; i < mus.size(); i++) {
            for (int j = 0; j < sortMus.size(); j++) {
                int temp = sortMus.get(j).getYear();
                if (temp < 2000) {
                    sortMus.remove(j);
                    break;
                }
            }
        }
        return sortMus;
    }

    public static void main(String[] args) {
        List<MusicBand> mus = new ArrayList<>();
        mus.add(new MusicBand("Skillet", 1996));
        mus.add(new MusicBand("Rammstein", 1994));
        mus.add(new MusicBand("Linkin park", 1996));
        mus.add(new MusicBand("Seether", 1999));
        mus.add(new MusicBand("Korn", 1993));
        mus.add(new MusicBand("My Chemical Romance", 2001));
        mus.add(new MusicBand("Franz Ferdinand", 2002));
        mus.add(new MusicBand("All Time Low", 2003));
        mus.add(new MusicBand("Alter Bridge", 2004));
        mus.add(new MusicBand("Fall Out Boy", 2001));

        Collections.shuffle(mus);

        List<MusicBand> sortMus = new ArrayList<>();
        sortMus.addAll(groupsAfter2000(mus));

        for (MusicBand list : mus) {
            System.out.println(list);
        }
        System.out.println('\n');
        for (MusicBand list : sortMus) {
            System.out.println(list);
        }
    }
}
