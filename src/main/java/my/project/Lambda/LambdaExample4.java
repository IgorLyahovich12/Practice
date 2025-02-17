package my.project.Lambda;
import java.util.*;
import java.util.stream.*;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                //      for (int n : numbers) {
                //            if (n > 3) {
                //                greaterThanThree.add(n);
                //            }
                //        }
                //replace code upper
                .filter(n -> n>3)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
