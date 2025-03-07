package my.project.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilterSteam {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        List<Integer> filterList=list.stream()
                .filter(integer -> integer%3==0)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(filterList);
    }
}
