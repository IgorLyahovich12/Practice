package my.project.exercise;
import my.project.entity.Task;

import java.util.PriorityQueue;
import java.util.Scanner;
public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        // Додаємо тестові дані
        taskQueue.add(new Task("Виконати звіт", 5));
        taskQueue.add(new Task("Написати код", 8));
        taskQueue.add(new Task("Перевірити пошту", 3));
        taskQueue.add(new Task("Підготувати презентацію", 7));

        while (true) {
            System.out.println("\n1. Додати завдання");
            System.out.println("2. Отримати завдання з найвищим пріоритетом");
            System.out.println("3. Переглянути всі завдання");
            System.out.println("4. Вийти");
            System.out.print("Виберіть дію: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть назву завдання: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть пріоритет (1-10): ");
                    int priority = scanner.nextInt();
                    taskQueue.add(new Task(name, priority));
                    System.out.println("Завдання додано!");
                    break;

                case 2:
                    if (!taskQueue.isEmpty()) {
                        System.out.println("Найважливіше завдання: " + taskQueue.poll());
                    } else {
                        System.out.println("Черга завдань порожня.");
                    }
                    break;

                case 3:
                    if (taskQueue.isEmpty()) {
                        System.out.println("Черга завдань порожня.");
                    } else {
                        System.out.println("Усі завдання:");
                        for (Task task : taskQueue) {
                            System.out.println(task);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Програма завершена.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
}
