package my.project.Stream;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static String findLongestUniqueSubstring(String s) {
        int left = 0, right = 0, maxLength = 0, startIndex = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        while (right < s.length()) {
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                right++;
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Найдовший унікальний підрядок: " + result);
        System.out.println("Його довжина: " + result.length());
    }
}

