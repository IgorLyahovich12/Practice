package my.project.Stream;

import java.time.LocalDate;
import java.util.List;
import my.project.entity.Event;
import my.project.service.EventService;

public class EventFilter {
    public static void main(String[] args) {
        // Створення списку подій
        List<Event> events = List.of(
                // 🎤 Концерти та музичні фестивалі
                new Event("Концерт Coldplay у Лондоні", LocalDate.of(2024, 7, 10), true),
                new Event("Виступ Imagine Dragons у Парижі", LocalDate.of(2024, 8, 15), false),
                new Event("Фестиваль електронної музики Tomorrowland", LocalDate.of(2024, 7, 20), true),
                new Event("Концерт The Weeknd у Берліні", LocalDate.of(2024, 9, 5), false),
                new Event("Фестиваль Coachella в Каліфорнії", LocalDate.of(2024, 4, 15), true),
                new Event("Джазовий фестиваль у Монтре", LocalDate.of(2024, 7, 1), true),
                new Event("Концерт Ed Sheeran у Мадриді", LocalDate.of(2024, 6, 22), false),
                new Event("Фестиваль Sziget в Угорщині", LocalDate.of(2024, 8, 8), true),
                new Event("Фестиваль Glastonbury у Великобританії", LocalDate.of(2024, 6, 28), true),
                new Event("Концерт Metallica в Амстердамі", LocalDate.of(2024, 5, 18), false),

                // ⚽ Футбольні матчі
                new Event("Фінал Ліги чемпіонів УЄФА", LocalDate.of(2024, 5, 29), true),
                new Event("Матч Англія – Німеччина на Євро", LocalDate.of(2024, 6, 20), false),
                new Event("Гра Барселона – Реал Мадрид (Ель-Класіко)", LocalDate.of(2024, 10, 1), false),
                new Event("Фінал Кубка світу з футболу", LocalDate.of(2026, 7, 10), false),
                new Event("Матч Ліверпуль – Манчестер Сіті в АПЛ", LocalDate.of(2024, 9, 25), false),
                new Event("Відкриття сезону Бундесліги", LocalDate.of(2024, 8, 12), false),
                new Event("Фінал Кубка Італії між Інтером та Ювентусом", LocalDate.of(2024, 5, 24), true),
                new Event("Матч Франція – Іспанія в Лізі націй", LocalDate.of(2024, 6, 5), false),
                new Event("Фінал Копа Лібертадорес", LocalDate.of(2024, 11, 12), false),
                new Event("Гра Баварія – Боруссія Дортмунд (Der Klassiker)", LocalDate.of(2024, 10, 15), false),

                // 🏀 Баскетбольні події
                new Event("Фінал НБА", LocalDate.of(2024, 6, 18), true),
                new Event("Матч Зоряних НБА", LocalDate.of(2025, 2, 16), false),
                new Event("Фінал Євроліги з баскетболу", LocalDate.of(2024, 5, 22), true),
                new Event("Матч Чикаго Буллз – Лос-Анджелес Лейкерс", LocalDate.of(2024, 11, 8), false),
                new Event("Чемпіонат світу з баскетболу FIBA", LocalDate.of(2027, 8, 25), false),
                new Event("Гра Барселона – Реал Мадрид у Євролізі", LocalDate.of(2024, 12, 3), false),
                new Event("Матч плей-оф НБА: Бостон Селтікс – Голден Стейт", LocalDate.of(2024, 5, 30), true),
                new Event("Фінал баскетбольного Кубка Іспанії", LocalDate.of(2024, 4, 10), true),
                new Event("Матч збірних США та Канади на Олімпіаді", LocalDate.of(2024, 7, 26), false),
                new Event("Турнір 3x3 у баскетболі Red Bull Reign", LocalDate.of(2024, 9, 14), false),

                // 🎭 Театральні та культурні події
                new Event("Вистава «Привид опери» на Бродвеї", LocalDate.of(2024, 7, 5), true),
                new Event("Фестиваль вуличного мистецтва в Барселоні", LocalDate.of(2024, 8, 22), false),
                new Event("Виступ Cirque du Soleil у Лас-Вегасі", LocalDate.of(2024, 9, 30), false),
                new Event("Фестиваль світлових шоу у Сіднеї", LocalDate.of(2024, 6, 14), true),
                new Event("Опен-ейр театр у Венеції", LocalDate.of(2024, 9, 18), false),
                new Event("Балет «Лебедине озеро» у Відні", LocalDate.of(2024, 12, 1), false),
                new Event("Оперний фестиваль у Вероні", LocalDate.of(2024, 8, 10), true),
                new Event("Міжнародний цирковий фестиваль у Монако", LocalDate.of(2025, 1, 20), false),
                new Event("Фестиваль комедій у Единбурзі", LocalDate.of(2024, 8, 5), false),
                new Event("Чемпіонат світу з брейк-дансу Red Bull BC One", LocalDate.of(2024, 10, 22), false)
        );

        // Створення екземпляра EventService
        EventService eventService = new EventService(events);

        // Фільтрація завершених подій
        List<Event> completedEvents = eventService.getCompletedEvents();
        System.out.println("Завершені події:");
        completedEvents.forEach(event -> System.out.println(event.getName()));

        // Фільтрація подій після певної дати
        LocalDate dateAfter = LocalDate.of(2024, 7, 1);
        List<Event> eventsAfterDate = eventService.getEventsAfterDate(dateAfter);
        System.out.println("\nПодії після 1 липня 2024:");
        eventsAfterDate.forEach(event -> System.out.println(event.getName()));

        // Фільтрація подій до певної дати
        LocalDate dateBefore = LocalDate.of(2024, 8, 1);
        List<Event> eventsBeforeDate = eventService.getEventsBeforeDate(dateBefore);
        System.out.println("\nПодії до 1 серпня 2024:");
        eventsBeforeDate.forEach(event -> System.out.println(event.getName()));

        // Фільтрація подій за ключовим словом
        String keyword = "Фестиваль";
        List<Event> eventsByKeyword = eventService.getEventsByWord(keyword);
        System.out.println("\nПодії з назвою \"" + keyword + "\":");
        eventsByKeyword.forEach(event -> System.out.println(event.getName()));
    }
}
