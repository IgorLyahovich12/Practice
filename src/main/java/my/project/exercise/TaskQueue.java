package my.project.exercise;
//Реалізуйте чергу завдань (TaskQueue), яка підтримує додавання,
// видалення та перегляд наступного завдання. (FIFO)
import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    private final Queue<String> queue= new LinkedList<>();

    public void addTask(String task) {
        queue.offer(task);
        System.out.println("Додано завдання: " + task);
    }

    public void removeTask() {
        if (queue.isEmpty()) {
            System.out.println("Черга порожня, немає завдань для видалення.");
        }
        String removedTask = queue.poll();
        System.out.println("Видалено завдання: " + removedTask);
    }

    public String peekTask() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();

        // Додавання завдань до черги
        taskQueue.addTask("Завдання 1");
        taskQueue.addTask("Завдання 2");
        taskQueue.addTask("Завдання 3");

        // Перегляд наступного завдання
        System.out.println("Наступне завдання: " + taskQueue.peekTask());

        // Видалення завдань
        taskQueue.removeTask();
        taskQueue.removeTask();

        // Перегляд наступного завдання після видалення
        System.out.println("Наступне завдання: " + taskQueue.peekTask());

        // Перевірка, чи порожня черга
        System.out.println("Чи порожня черга? " + taskQueue.isEmpty());

        // Видалення решти завдань
        taskQueue.removeTask();
        taskQueue.removeTask(); //  "Черга порожня"
    }
}
