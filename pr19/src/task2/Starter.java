package task2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 67, 12, 20));
        s.add(new Student("ФИО2", 57, 15, 18));
        s.add(new Student("ФИО3", 93, 12, 19));
        s.add(new Student("ФИО4", 24, 2, 18));
        s.add(new Student("ФИО5", 66, 25, 22));

        new LabClassUI(s);
    }

}