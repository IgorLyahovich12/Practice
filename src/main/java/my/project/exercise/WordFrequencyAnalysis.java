package my.project.exercise;

import java.util.*;

public class WordFrequencyAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        // Забираємо розділові знаки і приводимо до нижнього регістру
        text = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", "").toLowerCase();
        String[ ]word=text.split("\\s+");
        Map<String,Integer> countWord=new HashMap<>();
        for(String w:word){
            countWord.put(w,countWord.getOrDefault(w,0)+1);
        }
// Сортування за зменшенням частоти
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(countWord.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Сортування за значенням

        // Висновок топ-10 слів
        System.out.println("Топ 10 слов:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (++count == 10) break; // Обмежуємо 10 словами
        }
    }
}