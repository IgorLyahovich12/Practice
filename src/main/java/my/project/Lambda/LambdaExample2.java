package my.project.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Lambda for comparator
public class LambdaExample2 {
    public static void main(String[] args) {
  /*      List<String> words = Arrays.asList("Java", "Lambda", "Stream", "API");

        //  анонімний клас
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println(words);*/
        //Lambda replace code upper
        List<String> words = Arrays.asList("Java", "Lambda", "Stream", "API");
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(words);
        words.sort((s2,s1)->Integer.compare(s1.length(), s2.length()));
        System.out.println(words);
    }
}