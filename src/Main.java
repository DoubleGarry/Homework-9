public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] ledger = generateRandomArray();
        int spendingPerMonth = 0;
        for (int j : ledger) {
            spendingPerMonth += j;
        }
        {
            System.out.println(spendingPerMonth);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] ledger = generateRandomArray();
        int minSpendingPerDay = ledger[0];
        for (int j : ledger) {
            if (j <= minSpendingPerDay) {
                minSpendingPerDay = j;
            }
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей.");

        int maxSpendingPerDay = ledger[0];
        for (int j : ledger) {
            if (j > maxSpendingPerDay) {
                maxSpendingPerDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpendingPerDay + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] ledger = generateRandomArray();
        int average = 0;
        for (int j : ledger) {
            average += j / ledger.length;
        }
        {
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}