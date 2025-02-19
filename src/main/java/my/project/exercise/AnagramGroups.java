package my.project.exercise;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слова через пробіл:");

        String input = scanner.nextLine();
        scanner.close();


        String[] words = input.split("\\s+");


        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            // Сортуємо літери в слові, щоб отримати "ключ анаграми"
            String sortedKey = sortLetters(word);

            // Додаємо слово до відповідної групи анаграм
            anagramGroups.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
        }

        // Вивід груп анаграм
        System.out.println("\nГрупи анаграм:");
        anagramGroups.values().stream()
                .filter(group -> group.size() > 1) // Відсіюємо слова, які не мають анаграм
                .forEach(System.out::println);
    }

    // Метод для сортування літер у слові (створення "ключа анаграми")
    private static String sortLetters(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

