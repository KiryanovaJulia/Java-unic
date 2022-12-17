import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1.3
        int[] array = {5, 5, 6, 4, 7, 5, 2, 3, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("(FOR) Сумма элементов массива: " + sum);


        int i = 0;
        int summa = 0;
        while (i < array.length) {
            summa = summa + array[i];
            i++;
        }
        System.out.println("(WHILE) Сумма элементов массива: " + summa);

        int l = 0;
        int summ = 0;
        do {
            summ = summ + array[l];
            l++;
        } while (l < array.length);

        System.out.println("(DO_WHILE) Сумма элементов массива: " + summ);


        // Задание 1.4

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int arr[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int k = 0; k < size; k++) {
            arr[k] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Inserted array elements:");
        for (int k = 0; k < size; k++) {
            System.out.print(" " + arr[k]); // Выводим на экран, полученный массив
        }
        System.out.println();

        // Задание 1.5

        for (int p = 1; p < 11; p++)
        {
            System.out.println("Row " + 1./p);
        }



        //  Задание 1.6
        ArrayList<Integer> numbers = new ArrayList();

        System.out.println("First way with Math.random()");
        for (int z = 0; z < 20; z++)
        {
            double random_num = Math.random() * 10;
            numbers.add((int)random_num);
        }
        System.out.print(numbers);

        numbers.clear();
        System.out.println("\nSecond way with Random");
        Random random = new Random();
        for (int b = 0; b < 20; b++)
        {
            numbers.add(random.nextInt(10));
        }
        System.out.print(numbers);
        //  Задание 1.7

        int n = 5;
        long mul =1;
        for (int f = 1; f <= n; f++)
            mul *= f;

        System.out.print("\nFactorial " + mul);
    }





}