package day5;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public void getModel(){
        System.out.println(model);
    }
    public void getColor(){
        System.out.println(color);
    }
    public void getYear(){
        System.out.println(year);
    }
}
