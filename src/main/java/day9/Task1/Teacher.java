package day9.Task1;

public class Teacher extends Human {
    private String name;
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.name = name;
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.name);
    }
}
