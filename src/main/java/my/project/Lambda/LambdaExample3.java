package my.project.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  /*      for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }*/
        //Lambda replace code upper
        numbers.forEach(n -> { if (n % 2 == 0) System.out.println(n); });
    }
}
