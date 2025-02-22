package my.project.Stream;

import java.util.List;

public class AllEvenChecker {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,6,8,12,18,3,16,22);
        Boolean checker=list.stream().allMatch(x->x%2==0);
        System.out.println(checker);

    }
}
