package my.project.Stream;


import my.project.entity.FootballMatch;
import my.project.service.FootballMatchService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FootballMain {
    public static void main(String[] args) {
        // Створення списку матчів чемпіонату Іспанії 2009 року (100 матчів)
        List<FootballMatch> footballMatches = Arrays.asList(
                new FootballMatch("Real Madrid", "Barcelona", LocalDate.of(2009, 5, 2), true, "2-6"),
                new FootballMatch("Valencia", "Sevilla", LocalDate.of(2009, 3, 28), true, "2-1"),
                new FootballMatch("Villarreal", "Athletic Bilbao", LocalDate.of(2009, 4, 18), true, "1-1"),
                new FootballMatch("Atletico Madrid", "Real Madrid", LocalDate.of(2009, 5, 10), true, "1-2"),
                new FootballMatch("Mallorca", "Espanyol", LocalDate.of(2009, 3, 14), true, "3-1"),
                new FootballMatch("Getafe", "Real Sociedad", LocalDate.of(2009, 4, 4), true, "2-0"),
                new FootballMatch("Osasuna", "Almeria", LocalDate.of(2009, 5, 17), false, ""),
                new FootballMatch("Real Madrid", "Athletic Bilbao", LocalDate.of(2009, 4, 5), true, "3-1"),
                new FootballMatch("Sevilla", "Real Sociedad", LocalDate.of(2009, 3, 22), true, "4-2"),
                new FootballMatch("Villarreal", "Atletico Madrid", LocalDate.of(2009, 3, 29), true, "1-0"),
                new FootballMatch("Espanyol", "Valencia", LocalDate.of(2009, 4, 12), true, "2-3"),
                new FootballMatch("Almeria", "Real Sociedad", LocalDate.of(2009, 5, 3), true, "1-1"),
                new FootballMatch("Sevilla", "Barcelona", LocalDate.of(2009, 5, 2), true, "0-2"),
                new FootballMatch("Real Madrid", "Sevilla", LocalDate.of(2009, 5, 10), true, "3-2"),
                new FootballMatch("Getafe", "Villarreal", LocalDate.of(2009, 4, 19), true, "1-1"),
                new FootballMatch("Real Madrid", "Real Sociedad", LocalDate.of(2009, 4, 25), true, "4-1"),
                new FootballMatch("Mallorca", "Getafe", LocalDate.of(2009, 4, 5), true, "2-0"),
                new FootballMatch("Espanyol", "Athletic Bilbao", LocalDate.of(2009, 5, 16), true, "0-1"),
                new FootballMatch("Valencia", "Atletico Madrid", LocalDate.of(2009, 5, 3), true, "1-2"),
                new FootballMatch("Villarreal", "Sevilla", LocalDate.of(2009, 3, 8), true, "1-0"),
                new FootballMatch("Real Sociedad", "Osasuna", LocalDate.of(2009, 5, 9), true, "2-2"),
                new FootballMatch("Barcelona", "Valencia", LocalDate.of(2009, 3, 15), true, "3-0"),
                new FootballMatch("Real Madrid", "Mallorca", LocalDate.of(2009, 4, 18), true, "5-1"),
                new FootballMatch("Villarreal", "Almeria", LocalDate.of(2009, 3, 7), true, "2-1"),
                new FootballMatch("Getafe", "Osasuna", LocalDate.of(2009, 3, 21), true, "1-0"),
                new FootballMatch("Espanyol", "Real Madrid", LocalDate.of(2009, 5, 2), true, "0-4"),
                new FootballMatch("Atletico Madrid", "Sevilla", LocalDate.of(2009, 4, 26), true, "1-1"),
                new FootballMatch("Real Sociedad", "Almeria", LocalDate.of(2009, 3, 14), true, "2-3"),
                new FootballMatch("Athletic Bilbao", "Barcelona", LocalDate.of(2009, 5, 9), true, "0-4"),
                new FootballMatch("Valencia", "Getafe", LocalDate.of(2009, 5, 16), true, "2-0"),
                new FootballMatch("Mallorca", "Sevilla", LocalDate.of(2009, 5, 3), true, "3-2"),
                new FootballMatch("Osasuna", "Barcelona", LocalDate.of(2009, 3, 28), true, "1-3"),
                new FootballMatch("Atletico Madrid", "Villarreal", LocalDate.of(2009, 5, 10), true, "2-2"),
                new FootballMatch("Getafe", "Barcelona", LocalDate.of(2009, 4, 18), true, "0-1"),
                new FootballMatch("Real Madrid", "Sevilla", LocalDate.of(2009, 3, 8), true, "2-2"),
                new FootballMatch("Almeria", "Espanyol", LocalDate.of(2009, 4, 5), true, "1-1"),
                new FootballMatch("Real Sociedad", "Athletic Bilbao", LocalDate.of(2009, 4, 19), true, "3-0"),
                new FootballMatch("Villarreal", "Getafe", LocalDate.of(2009, 5, 17), true, "2-1"),
                new FootballMatch("Sevilla", "Mallorca", LocalDate.of(2009, 3, 15), true, "1-0"),
                new FootballMatch("Barcelona", "Villarreal", LocalDate.of(2009, 3, 22), true, "4-1"),
                new FootballMatch("Athletic Bilbao", "Osasuna", LocalDate.of(2009, 5, 2), true, "2-0"),
                new FootballMatch("Valencia", "Real Sociedad", LocalDate.of(2009, 4, 12), true, "4-0"),
                new FootballMatch("Espanyol", "Atletico Madrid", LocalDate.of(2009, 5, 17), true, "1-1"),
                new FootballMatch("Osasuna", "Villarreal", LocalDate.of(2009, 5, 16), true, "1-1"),
                new FootballMatch("Real Madrid", "Getafe", LocalDate.of(2009, 4, 26), true, "4-0"),
                new FootballMatch("Almeria", "Real Madrid", LocalDate.of(2009, 4, 5), true, "0-4"),
                new FootballMatch("Sevilla", "Atletico Madrid", LocalDate.of(2009, 3, 28), true, "2-1"),
                new FootballMatch("Real Sociedad", "Villarreal", LocalDate.of(2009, 3, 22), true, "0-1"),
                new FootballMatch("Espanyol", "Osasuna", LocalDate.of(2009, 4, 18), true, "1-2"),
                new FootballMatch("Getafe", "Valencia", LocalDate.of(2009, 4, 4), true, "2-3"),
                new FootballMatch("Mallorca", "Real Sociedad", LocalDate.of(2009, 5, 17), true, "2-1"),
                new FootballMatch("Almeria", "Atletico Madrid", LocalDate.of(2009, 4, 25), true, "1-0"),
                new FootballMatch("Real Madrid", "Espanyol", LocalDate.of(2009, 3, 8), true, "4-0"),
                new FootballMatch("Osasuna", "Getafe", LocalDate.of(2009, 5, 2), true, "0-0"),
                new FootballMatch("Barcelona", "Villarreal", LocalDate.of(2009, 4, 18), true, "2-1"),
                new FootballMatch("Sevilla", "Real Sociedad", LocalDate.of(2009, 4, 12), true, "4-1"),
                new FootballMatch("Villarreal", "Real Madrid", LocalDate.of(2009, 3, 14), true, "2-2"),
                new FootballMatch("Atletico Madrid", "Getafe", LocalDate.of(2009, 4, 5), true, "1-1"),
                new FootballMatch("Espanyol", "Real Sociedad", LocalDate.of(2009, 4, 19), true, "1-0"),
                new FootballMatch("Almeria", "Valencia", LocalDate.of(2009, 3, 7), true, "1-2"),
                new FootballMatch("Real Madrid", "Villarreal", LocalDate.of(2009, 5, 10), true, "1-0"),
                new FootballMatch("Barcelona", "Sevilla", LocalDate.of(2009, 3, 21), true, "4-0"),
                new FootballMatch("Osasuna", "Valencia", LocalDate.of(2009, 5, 3), true, "2-1"),
                new FootballMatch("Espanyol", "Getafe", LocalDate.of(2009, 5, 3), true, "3-0"),
                new FootballMatch("Real Madrid", "Barcelona", LocalDate.of(2009, 4, 25), true, "2-1"),
                new FootballMatch("Villarreal", "Sevilla", LocalDate.of(2009, 4, 18), true, "1-1"),
                new FootballMatch("Atletico Madrid", "Almeria", LocalDate.of(2009, 5, 17), true, "3-1"),
                new FootballMatch("Getafe", "Real Madrid", LocalDate.of(2009, 3, 28), true, "1-2")
        );

        // Створення сервісу для роботи з матчами
        FootballMatchService matchService = new FootballMatchService(footballMatches);

        // Викликаємо методи сервісу та виводимо результати
        System.out.println("Усі домашні команди:");
        matchService.getHomeTeam().forEach(System.out::println);

        System.out.println("\nУсі гостеві команди:");
        matchService.getGuestsTeam().forEach(System.out::println);

        System.out.println("\nУсі матчі:");
        matchService.getFootballMatches().forEach(System.out::println);

        System.out.println("\nМатчі для команди Real Madrid:");
        matchService.getFootballMatchesTeam("Real Madrid").forEach(System.out::println);

        System.out.println("\nМатчі для команди Barcelona вдома:");
        matchService.getFootballMatchesTeamHome("Barcelona").forEach(System.out::println);

        System.out.println("\nМатчі для команди Barcelona в гостях:");
        matchService.getFootballMatchesTeamGuests("Barcelona").forEach(System.out::println);

        System.out.println("\nМатчі для команд Real Madrid та Barcelona:");
        matchService.getFootballMatchesWithSpecificTeam("Real Madrid", "Barcelona").forEach(System.out::println);

        System.out.println("\nДати матчів для команд Real Madrid та Barcelona:");
        matchService.getMatchDate("Real Madrid", "Barcelona").forEach(System.out::println);

        System.out.println("\nЗавершені матчі:");
        matchService.getCompletedMatch().forEach(System.out::println);


        System.out.println("\nВсі матчі як строки:");
        System.out.println(matchService.toStringMatches());
    }
}

