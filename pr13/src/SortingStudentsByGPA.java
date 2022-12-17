import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator {

    public void mergeSort(Student[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        Student[] leftHalf = new Student[midIndex];
        Student[] rightHalf = new Student[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(Student[] inputArray, Student[] leftHalf, Student[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getGPD() >= rightHalf[j].getGPD()) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    public void quickSort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }

    public void quickSort(Student[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Student pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    private static int partition(Student[] array, int lowIndex, int highIndex, Student pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer].getGPD() <= pivot.getGPD() && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer].getGPD() >= pivot.getGPD() && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(Student[] array, int index1, int index2) {
        Student temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}