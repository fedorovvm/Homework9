import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1.
        System.out.println("Задание 1.");
        int[] expenses = {5000, 7000, 10000, 3000, 5000};
        int sum = 0;
        for (int element : expenses) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей.");
        //Task 2.
        System.out.println("Задание 2.");
        int maxExpenses = -1;
        for (int element1 : expenses) {
            if (element1 > maxExpenses) {
                maxExpenses = element1;
            }
        }
        int minExpenses = maxExpenses;
        for (int element1 : expenses) {
            if (element1 < minExpenses) {
                minExpenses = element1;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +minExpenses+ " рублей. Максимальная сумма трат за неделю составила "+maxExpenses+" рублей.");
        //Task 3.
        System.out.println("Задание 3.");
        float  averageSum=sum/expenses.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageSum+" рублей.");
        //Task 4.
        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length-1); i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}