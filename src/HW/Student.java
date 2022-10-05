package HW;

public class Student {
    public static void main (String[] args) {
        // Creating object 1
        int student_age1 = 10;
        String student_firstName1 = "Vova";
        String student_lastName1 = "Sidorov";
        int student_class1 = 5;
        String student_subject1 = "Uchenik";
        String postfix = "-go klassa ";

        System.out.println("****************************************");
        System.out.println(
                "First name: \t"
                        + student_firstName1
                        + ", \n"
                        + "Last name: \t"
                        + student_lastName1
                        + ", \n"
                        + student_subject1
                        + " "
                        + student_class1
                        + postfix
                        + " \n"
        );

        System.out.println("________________________________________________");

        // Creating object 2
        int student_age2 = 14;
        String student_firstName2 = "Masha";
        String student_lastName2 = "Semenova";
        int student_class2 = 9;
        String student_subject2 = "Uchenitsa";

        System.out.println("****************************************");
        System.out.println(
                "First name: \t"
                        + student_firstName2
                        + ", \n"
                        + "Last name: \t"
                        + student_lastName2
                        + ", \n"
                        + student_subject2
                        + " "
                        + student_class2
                        + postfix
                        + " \n"
        );

        System.out.println("________________________________________________");

    }
}
