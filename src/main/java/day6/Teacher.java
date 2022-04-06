package day6;

public class Teacher {
    private String name;
    private String subject;

    //Students nameSt;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Students nameSt) {
        String studentsName = nameSt.getName();

        int val = (int) (Math.random() * 4) + 2;

        String sVal = "";

        switch (val) {
            case 2:
                sVal = "Неудовлетворительно";
                break;
            case 3:
                sVal = "Удовлетворительно";
                break;
            case 4:
                sVal = "Хорошо";
                break;
            default:
                sVal = "Отлично";
                break;
        }
        System.out.println("Преподователь " + name + " оценил студента с именм " + studentsName + " по предмету " + subject + " оценку " + sVal);

    }

}
