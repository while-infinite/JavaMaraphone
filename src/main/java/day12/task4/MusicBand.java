package day12.task4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MusicBand {
    private String groupName;
    private int year;
    private  List<String> members;



    public MusicBand(String groupName, int year, List<String> members) {
        this.groupName =groupName;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand band1, MusicBand band2){
         band2.members.addAll(band1.members);
         band1.members.removeAll(band1.members);
    }
    public void printMembers(){
        for(String list : this.members )
            System.out.println(list);
    }

    public List<String> getMembers(){

        return members;
    }

}
