package my.project.entity;

import java.time.LocalDate;

public class FootballMatch {
    private final String teamA;
    private final String teamB;
    private final LocalDate matchDate;
    private final boolean isPlayed; // чи зіграний матч
    private final String result; // результат матчу, якщо зіграно

    public FootballMatch(String teamA, String teamB, LocalDate matchDate, boolean isPlayed, String result) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.isPlayed = isPlayed;
        this.result = result;
    }

    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        if (isPlayed) {
            return "Матч: " + teamA + " vs " + teamB + " на " + matchDate + " (Зіграно) - Результат: " + result;
        } else {
            return "Матч: " + teamA + " vs " + teamB + " на " + matchDate + " (Не зіграно)";
        }
    }
}
