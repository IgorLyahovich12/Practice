package my.project.exercise;

import java.util.*;

public class WorkWithStructures {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Random random = new Random();

        // Додавання 1 000 000 елементів
        measureTime("ArrayList Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                arrList.add(random.nextInt(1_000_000));
            }
        });

        measureTime("LinkedList Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                linkedList.add(random.nextInt(1_000_000));
            }
        });

        measureTime("HashSet Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                hashSet.add(random.nextInt(1_000_000));
            }
        });

        measureTime("TreeSet Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                treeSet.add(random.nextInt(1_000_000));
            }
        });

        measureTime("HashMap Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                map.put(i, random.nextInt(1_000_000));
            }
        });

        measureTime("TreeMap Add", () -> {
            for (int i = 0; i < 1_000_000; i++) {
                treeMap.put(i, random.nextInt(1_000_000));
            }
        });

        // Пошук випадкового елемента
        int searchValue = random.nextInt(1_000_000);
        measureTime("ArrayList Search", () -> arrList.contains(searchValue));
        measureTime("LinkedList Search", () -> linkedList.contains(searchValue));
        measureTime("HashSet Search", () -> hashSet.contains(searchValue));
        measureTime("TreeSet Search", () -> treeSet.contains(searchValue));
        measureTime("HashMap Search", () -> map.containsValue(searchValue));
        measureTime("TreeMap Search", () -> treeMap.containsValue(searchValue));

        // Видалення випадкового елемента
        measureTime("ArrayList Remove", () -> arrList.remove(Integer.valueOf(searchValue)));
        measureTime("LinkedList Remove", () -> linkedList.remove(Integer.valueOf(searchValue)));
        measureTime("HashSet Remove", () -> hashSet.remove(searchValue));
        measureTime("TreeSet Remove", () -> treeSet.remove(searchValue));
        measureTime("HashMap Remove", () -> map.remove(searchValue));
        measureTime("TreeMap Remove", () -> treeMap.remove(searchValue));
    }

    private static void measureTime(String operation, Runnable action) {
        long startTime = System.nanoTime();
        action.run();
        long endTime = System.nanoTime();
        System.out.println(operation + " took " + (endTime - startTime) + " ns");
    }
}
//Додавання елементів
//ArrayList найшвидший серед списків.
//LinkedList повільніший через оновлення зв’язків.
//HashSet і HashMap швидші, ніж TreeSet і TreeMap, бо використовують хешування.
//TreeSet і TreeMap набагато повільніші через балансування дерева.
//Пошук елемента
//HashSet – найшвидший (O(1)).
//TreeSet повільніше (O(log n)).
//ArrayList та LinkedList працюють погано через O(n).
//HashMap шукає значення дуже повільно (O(n)).
//Видалення елемента
//HashSet і HashMap – найшвидші (O(1)).
//TreeSet і TreeMap повільніші (O(log n)).
//ArrayList та LinkedList дуже повільні (O(n)).