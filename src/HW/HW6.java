package HW;

public class HW6 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) {
        String line = "-----------------------------------------";
//        vvod(1, line);
//        task1();
//        vvod(2, line);
//        task2();
//        vvod(3, line);
//        task3();
//        vvod(4, line);
//        task4();
//        vvod(5, line);
//        task5();
//        vvod(6, line);
//        task6();
//        vvod(7, line);
//        task7();
//        vvod(8, line);
//        task8();
//        vvod(9, line);
//        task9();
//        vvod(10, line);
//        task10(2.1, 2.9, 0.047);
//        vvod(11, line);
//        task11('e','k');
//        vvod(12, line);
//        task12(10);
//        vvod(13, line);
//        task13(31);
//        vvod(14, line);
//        task14();
//        vvod(15, line);
//        task15();
//        vvod(16, line);
//        task16();
        vvod(17, line);
        task17(0, 7, 3);
    }

    public static void vvod(int num, String line){
        System.out.println();
        System.out.println(line);
        System.out.println("Task # " + num);
        System.out.println();
    }
    public static void task1() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task2(){
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3(){
        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task4() {
        for (int i = 327; i > 300; i--) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task5(){
        for (float i = 12; i <= 13; i += 0.09) {
            System.out.printf("%6.1f", i);
        }
    }

    public static void task6() {
        for (int i = 215; i <= 237; i ++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task7() {
        for (int i = 7; i <= 13; i++){
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void task8() {
        for (short i = -32768; i < 32767; i++){
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task9() {
        for (int i = -10; i <= 34; i++) {
            if (i == 0){
                System.out.print("ZERO" + " ");
                continue;
            }
            if (i % 11 == 0) {
                System.out.print(ANSI_BLUE + i + ANSI_RESET + " ");
                continue;
            }
            if (i % 12 == 0) {
                System.out.print(ANSI_RED + i + ANSI_RESET + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void task10(double start, double end, double step) {
        for (double i = start; i < end; i += step) {
            System.out.printf("%7.3f", i);
        }
    }

    public static void task11(char n, char m) {
        for (char i = n; i <= m; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task12(int l) {
        for (int i = 0; i < 2 * l; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task13(int n) {
        for (int i = 1; i <= n; i *= 2) {
            System.out.print(i + " ");
        }
    }
    public static void task14(){
        for (int n = 1; n <= 4; n++) {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(i);
                }
            }
        }
    }

    public static void task15() {
        int expectedResult0 = 0;
        int expectedResult1 = 1;
        int expectedResult2 = -1;
        int expectedResult3 = 2;
        int expectedResult4 = -2;
        int expectedResult5 = 3;
        int expectedResult6 = -3;
        int expectedResult7 = 4;
        int expectedResult8 = -4;
        int expectedResult9 = 5;
        int expectedResult10 = -5;
        int count = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
            if (i == 0) {
                int actualResult0 = i;
                if (actualResult0 == expectedResult0) {
                    count++;
                }
            } else {
                System.out.print(-i + " ");
                if (i == 1) {
                    int actualResult1 = 1;
                    int actualResult2 = -1;
                    if (actualResult1 == expectedResult1) count++; else break;
                    if (actualResult2 == expectedResult2) count++; else  break;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static void task16() {
        for (int i = 0; i <= 25; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task17(int n, int m, int l) {
        for (int i = n; i < 2 * l; i += m) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }


}
