package my.project.Stream;

import java.util.List;

import java.util.stream.Collectors;

public class WordsStartingWithC {
    public static void main(String[] args) {
        List<String> words = List.of("car", "cat", "dog", "camera", "cup", "pen");

        List<String> startingWithC = words.stream()
                .filter(w -> w.startsWith("c"))
                .collect(Collectors.toList());

        System.out.println(startingWithC);
    }
}

