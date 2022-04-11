package day12.task5;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
