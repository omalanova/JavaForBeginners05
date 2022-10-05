package HW;

public class Person {
    public static void main (String[] args) {
        int yob = 1990;
        int age = 2022 - yob;
        int age2ago = 2022 - 2 - yob;

        System.out.println("Если человек родился в "
                + yob
                + " году, то его возраст - разница между 2022 и "
                + yob
                + ". И это - "
                + age
        );

        System.out.println("Если человек родился в "
                + yob
                + " году, то его возраст 2 года назад - разница между 2020 и "
                + yob
                + ". И это - "
                + age2ago
        );
    }
}
