public class Main {
    public static void main(String[] args) {
        System.out.println("Numbers 1-10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println ( );
        System.out.println("Numbers 10-1");
        for (int i = 10; i >=1; i--) {
            System.out.println(i);
        }

        System.out.println ( );
        System.out.println("Even Numbers 0-17");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
        }

        System.out.println ( );
        System.out.println("Numbers 10-(-10)");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        System.out.println ( );
        System.out.println("Leap Year 1904-2096");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println ( );
        System.out.println("i+7");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println ( );
        System.out.println("i*2");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("\nSavings every month");
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            int savingsPerMonth = 29000;
            savings = savings + savingsPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("\nSavings every month, 12% interest");
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            int sumPerMonth = 29000 + 29000 / 100;
            totalSum = totalSum + sumPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSum + " рублей");
        }
    }
}