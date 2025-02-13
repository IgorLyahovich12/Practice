package my.project.exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MissingNumber {

    // Метод для генерації випадкового числа в діапазоні
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Запитуємо максимальне число, яке буде також розміром масиву
        System.out.print("Введіть максимальне число (і розмір масиву): ");
        int n = sc.nextInt();
        // Створюємо масив та HashSet
        int[] array = new int[n];
        TreeSet<Integer> numbersSet = new TreeSet<>();
        // Заповнюємо масив унікальними випадковими числами від 1 до n
        int i = 0;
        while (i < n-1) {
            int num = randomNumber(1, n);
            if (!numbersSet.contains(num)) {
                numbersSet.add(num);
                array[i] = num;
                i++;
            }
        }
        // Виводимо згенерований масив
        System.out.print("Згенерований масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Шукаємо відсутнє число (число, яке було вилучене)
        int missingNumber = 0;
        for (int num = 1; num <= n; num++) {
            if (!numbersSet.contains(num)) {
                missingNumber = num;
                break;
            }
        }
        System.out.println("Відсутнє число: " + missingNumber);
        sc.close();
    }
}

