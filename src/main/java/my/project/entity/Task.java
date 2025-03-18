package my.project.entity;

public class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority); // Вищий пріоритет — першим
    }

    @Override
    public String toString() {
        return "Завдання: " + name + " (Пріоритет: " + priority + ")";
    }
}
