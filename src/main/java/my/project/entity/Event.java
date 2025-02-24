package my.project.entity;

import java.time.LocalDate;

public class Event {
    private String name;
    private LocalDate date;
    private boolean isCompleted;

    public Event(String name, LocalDate date, boolean isCompleted) {
        this.name = name;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public String getName() {
        return name;
    }
    public LocalDate getDate() {
        return date;
    }
    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return "Подія: " + name + " (дата: " + date + ")";
    }
}

