package my.project.exercise;
/*
Завдання: Унікальні слова у списку речень
📌 Мета: Використати Set, Stream API, та лямбда-вирази.

🔹 Опис завдання:
Користувач вводить речення .
Програма повинна:
Розділити всі речення на окремі слова.
Видалити повторювані слова (залишити лише унікальні).
Відсортувати їх у алфавітному порядку.
Вивести унікальні слова у відсортованому вигляді.
*/

import java.util.*;
import java.util.stream.*;

public class UniqueWords {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        String text = uniqueWords.inputText(); // Отримуємо текст від користувача
        Set<String> wordsSet = uniqueWords.createTreeSet(text); // Обробляємо текст
        System.out.println("Унікальні слова у відсортованому порядку: " + wordsSet);
    }

    public String inputText() {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        System.out.println("Введіть текст (порожній рядок для завершення):");
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) break; // Якщо порожній рядок, завершити введення
            text.append(line).append(" ");
        }
        return text.toString().trim(); // Видаляємо зайві пробіли
    }

    public Set<String> createTreeSet(String text) {
        // Створення Set за допомогою Stream API та лямбда-виразів
        return Arrays.stream(text.split("[\\s\\p{Punct}&&[^'-]]+")) // Розділяємо текст на слова
                .map(word -> word.toLowerCase()) // Перетворюємо кожне слово в нижній регістр
                .filter(word -> !word.matches("[-']+")) // Фільтруємо лише дефіси та апострофи
                .collect(Collectors.toCollection(TreeSet::new)); // Збираємо в TreeSet
    }
}
