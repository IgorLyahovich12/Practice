package my.project.Stream;

import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        double average = numbers.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);

        System.out.println("Середнє значення: " + average);
    }
}
