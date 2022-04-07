package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student st = new Student("Виктор", "Группа 11А");
        Teacher t = new Teacher("Андрей Сергеевич", "Прикладная математика");
        System.out.println(st.getGroupName());
        System.out.println(t.getSubjectName());
        st.printInfo();
        t.printInfo();
    }
}
