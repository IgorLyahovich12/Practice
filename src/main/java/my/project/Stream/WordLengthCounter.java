package my.project.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class WordLengthCounter {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "strawberry", "pear");

        List<String> filteredWords = words.stream()
                .filter(w -> w.length() > 4)
                .collect(Collectors.toList());

        System.out.println(filteredWords);
    }
}