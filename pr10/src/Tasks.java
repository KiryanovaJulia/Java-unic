import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //System.out.println(task4(0, 0, 3, 15));
        //System.out.println(task5(123));
        //System.out.println(task6(3, 2) ? "YES" : "NO");
        //task7(150, 2);
        //System.out.println(task8("rotator"));
        //System.out.println(task9(5, 8));
        //System.out.println(task10(158, 0));
        //System.out.println(task11());
        //task12();
        //task13();
        //System.out.println(task14(1000));
        //System.out.println(task15(2022));
        //task16(0, 0);
        //System.out.println(task17());
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(repeat(i, (String) (i + ", ")));
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i != n)
                System.out.print(i + ", ");
            else
                System.out.println(i);
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();

        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++)
            {
                if (i != b)
                    System.out.print(i + ", ");
                else
                    System.out.println(i);
            }
        }
        else {
            for (int i = a; i >= b; i--)
            {
                if (i != b)
                    System.out.print(i + ", ");
                else
                    System.out.println(i);
            }
        }

    }

    public static int task4(int len, int sum, int k, int s) {
        // Base case
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Step
        for (int i = c; i < 10; i++)
            res += task4(len + 1, sum + i, k, s);

        return res;
    }

    public static int task5(int n) {
        // Base case
        if (n < 10)
            return n;
            // Step
        else
            return n % 10 + task5(n / 10);
    }

    public static boolean task6(int n, int i) {
        // i- additional parameter. Must be equal 2.
        // Base case
        if (n < 2) {
            return false;
        } // Base case
        else if (n == 2) {
            return true;
        } // Base case
        else if (n % i == 0) {
            return false;
        } // Step
        else if (i < n / 2) {
            return task6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void task7(int n, int k) {
        // Base
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Step
        if (n % k == 0) {
            System.out.println(k);
            task7(n / k, k);
        } // Step
        else {
            task7(n, ++k);
        }
    }

    public static String task8(String s) {
        // Base
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Base
                if (s.length() == 2) {
                    return "YES";
                }
                // Step
                return task8(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }

    public static int task9(int a, int b) {
        // Base case
        if (a > b + 1) {
            return 0;
        }
        // Base case
        if (a == 0 || b == 0) {
            return 1;
        }
        // Step and recursion statement
        return task9(a, b - 1) + task9(a - 1, b - 1);
    }

    public static int task10(int n, int i) {
        return (n==0) ? i : task10( n/10, i*10 + n%10 );
    }

    public static int task11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Base case
        if (n == 1) {
            int m = in.nextInt();
            // Base case
            if (m == 1) {
                // Step
                return task11() + n + m;
            } else {
                int k = in.nextInt();
                // Base case
                if (k == 1) {
                    // Step
                    return task11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Base case
            if (m == 1) {
                // Step
                return task11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void task12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Base case
        if (n > 0) {
            // Step
            if (n % 2 == 1) {
                System.out.println(n);
                task12();
            } else {
                task12();
            }
        }
    }

    public static void task13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Base
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Base
            if (m > 0) {
                // Step
                task13();
            }
        }
    }

    public static String task14(int n) {
        // Base case
        if (n < 10) {
            return Integer.toString(n);
        } // Step
        else {
            return task14(n / 10) + " " + n % 10;
        }
    }

    public static int task15(int n) {
        // Base case
        if (n < 10) {
            return n;
        }// Step
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }

    public static void task16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Base case
        if (n > 0) {
            // Step
            if (n > max) {
                task16(n, 1);
            } // Step
            else if (n == max) {
                task16(max, ++count);
            } // Step
            else {
                task16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int task17() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, task17());
        }
    }

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }
}