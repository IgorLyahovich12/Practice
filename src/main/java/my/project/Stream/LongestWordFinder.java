package my.project.Stream;
import java.util.List;
import java.util.Comparator;

public class LongestWordFinder {
    public static void main(String[] args) {
        List<String> words = List.of("elephant", "cat", "dolphin", "ant", "hippopotamus");

        String longestWord = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("Longest word: " + longestWord);
    }
}
