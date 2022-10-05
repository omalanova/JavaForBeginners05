package HW;

public class HW6 {
    public static void main(String[] args) {
        String line = "-----------------------------------------";
        vvod(1, line);
        task1();
        vvod(2, line);
        task2();
        vvod(3, line);
        task3();
        vvod(4, line);
        task4();
        vvod(5, line);
        task5();
        vvod(6, line);
        task6();
        vvod(7, line);
        task7();
        vvod(8, line);
        task8();
        vvod(9, line);
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




}
