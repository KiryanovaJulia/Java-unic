import java.util.Arrays;

import static java.util.Collections.swap;

public class Tester {
    public static void main(String[] args) {
        Student mike = new Student();
        Student jake = new Student();
        Student bob = new Student();
        Student artur = new Student();
        Student jason = new Student();
        Student dwayne = new Student();

        Student[] students = {mike, jake, bob, artur, jason, dwayne};

        mike.setGPD(3.4);
        jake.setGPD(4.1);
        bob.setGPD(5.0);
        artur.setGPD(2.7);
        jason.setGPD(3.7);
        dwayne.setGPD(4.4);

        SortingStudentsByGPA s = new SortingStudentsByGPA();

        System.out.print("Before sorting: ");
        printArray(students);

        //s.mergeSort(students);
        s.quickSort(students);
        System.out.println("\n");

        System.out.print("After sorting: ");
        printArray(students);


    }

    public static void printArray(Student[] arr) {
        for (Student student : arr)
            //System.out.println(student.getId());
            System.out.print(student.getGPD() + " ");
    }

    public static void selectionSort(Student[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minIndex = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i].getId() < arr[minIndex].getId())
                    minIndex = i;
            }
            swap(Arrays.asList(arr), left, minIndex);
        }
    }
}