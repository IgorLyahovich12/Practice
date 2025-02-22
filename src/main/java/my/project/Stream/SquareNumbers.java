package my.project.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List <Integer> squareNumbers=numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(squareNumbers);
    }
}
