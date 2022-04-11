package day12.task5;

import java.util.List;


public class MusicBand {
    private String groupName;
    private int year;
    private List<MusicArtist> artist;


    public MusicBand(String groupName, int year, List<MusicArtist> artist) {
        this.groupName = groupName;
        this.year = year;
        this.artist = artist;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.artist.addAll(band1.artist);
        band1.artist.removeAll(band1.artist);
    }

    public void printMembers() {
        for (MusicArtist list : this.artist)
            System.out.println(list);
    }

    public List<MusicArtist> getMembers() {
        return artist;
    }

}
