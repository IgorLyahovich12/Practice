package my.project.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
    }

    public static void main(String[] args) {
        String input = "  Hello   world!  This is an interview  ";
        String result = reverseWords(input);
        System.out.println(result);
    }
}
