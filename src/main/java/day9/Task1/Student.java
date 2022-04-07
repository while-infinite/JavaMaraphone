package day9.Task1;

public class Student extends Human {
    private String name;
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.name = name;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + this.name);
    }
}
