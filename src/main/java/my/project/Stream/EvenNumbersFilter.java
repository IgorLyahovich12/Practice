package my.project.Stream;

import java.util.List;

public class EvenNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> pairedNumbers= numbers.stream()
                .filter(n->n%2==0)
                .toList();

        System.out.println(pairedNumbers);
    }
}
