package my.project.Stream;


import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 7, 1, 9, 4);

        int sum = list.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println("Sum: " + sum);
    }
}
