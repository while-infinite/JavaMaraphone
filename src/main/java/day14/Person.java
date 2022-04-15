package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.math.NumberUtils;

public class Person {
    private String name;
    private int year;

    public Person(String name, int year) {
        this.year = year;
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
