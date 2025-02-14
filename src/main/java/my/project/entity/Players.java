package my.project.entity;

import java.util.Objects;

public class Players implements Comparable<Players> {
    private String nickname;
    private String team;
    private double rate;
    public Players(String nickname, String team, double rate) {
        this.nickname = nickname;
        this.team = team;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Double.compare(rate, players.rate) == 0 && Objects.equals(nickname, players.nickname) && Objects.equals(team, players.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, team, rate);
    }

    @Override
    public String toString() {
        return "Players{" +
                "nickname='" + nickname + '\'' +
                ", team='" + team + '\'' +
                ", rate=" + rate +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public int compareTo(Players other) {
        return Double.compare(other.rate, this.rate);
    }
}
