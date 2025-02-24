package my.project.service;

import my.project.entity.FootballMatch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FootballMatchService {
    private final List<FootballMatch> footballMatches;

    public FootballMatchService(List<FootballMatch> footballMatches) {
        this.footballMatches = footballMatches;
    }
    public List<String> getHomeTeam() {
        return footballMatches.stream()
                .map(FootballMatch::getTeamA)
                .collect(Collectors.toList());
    }
    public List<String> getGuestsTeam() {
        return footballMatches.stream()
                .map(FootballMatch::getTeamB)
                .collect(Collectors.toList());
    }
    public List<FootballMatch> getFootballMatches() {
        return footballMatches;
    }
    public List<FootballMatch> getFootballMatchesTeam(String name) {
        return footballMatches.stream()
                .filter(match -> match.getTeamA().equals(name) || match.getTeamB().equals(name))
                .collect(Collectors.toList());
    }
    public List<FootballMatch> getFootballMatchesTeamHome(String name) {
        return footballMatches.stream()
                .filter(match -> match.getTeamA().equals(name) )
                .collect(Collectors.toList());
    }
    public List<FootballMatch> getFootballMatchesTeamGuests(String name) {
        return footballMatches.stream()
                .filter(match -> match.getTeamB().equals(name) )
                .collect(Collectors.toList());
    }
    public List<FootballMatch> getFootballMatchesWithSpecificTeam(String name1,String name2) {
        return footballMatches.stream()
                .filter(match->(
                        match.getTeamA().equals(name1)||match.getTeamA().equals(name2))&&
                        (match.getTeamB().equals(name1)||match.getTeamB().equals(name2)))
                .collect(Collectors.toList());
    }
    public List<LocalDate> getMatchDate(String name1, String name2) {
        return footballMatches.stream()
                .filter(match ->
                        (match.getTeamA().equals(name1) || match.getTeamA().equals(name2)) &&
                                (match.getTeamB().equals(name1) || match.getTeamB().equals(name2)))
                .map(FootballMatch::getMatchDate)
                .collect(Collectors.toList());
    }
    public List<FootballMatch> getCompletedMatch() {
        return footballMatches.stream()
                .filter(FootballMatch::isPlayed)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public List<String> getResultMatchWithSpecificTeam(String name1, String name2) {
        return footballMatches.stream()
                .filter(match ->
                        (match.getTeamA().equals(name1) || match.getTeamA().equals(name2)) &&
                                (match.getTeamB().equals(name1) || match.getTeamB().equals(name2)))
                .map(FootballMatch::getResult)
                .collect(Collectors.toList());
    }

    public String toStringMatches() {
        return footballMatches.stream()
                .map(FootballMatch::toString)
                .collect(Collectors.joining("\n"));
    }
}

