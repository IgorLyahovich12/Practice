package my.project.service;

import my.project.entity.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventService {
    private final List<Event> events;

    public EventService(List<Event> events) {
        this.events = events;
    }

    // Отримуємо тільки завершені події
    public List<Event> getCompletedEvents() {
        return events.stream()
                .filter(Event::isCompleted)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Отримуємо події після вказаної дати
    public List<Event> getEventsAfterDate(LocalDate date) {
        return events.stream()
                .filter(event -> event.getDate().isAfter(date))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Отримуємо події до вказаної дати
    public List<Event> getEventsBeforeDate(LocalDate date) {
        return events.stream()
                .filter(event -> event.getDate().isBefore(date))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Отримуємо події по слову в назві
    public List<Event> getEventsByWord(String word) {
        return events.stream()
                .filter(event -> event.getName().toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

}

