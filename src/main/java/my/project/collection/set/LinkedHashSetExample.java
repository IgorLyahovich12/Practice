package my.project.collection.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // Додавання елементів
        lhs.add(1);
        lhs.add(31);
        lhs.add(22);
        lhs.add(42);
        lhs.add(31); // множина не допускає дублікатів

        System.out.println("Розмір множини: " + lhs.size()); // 4
        System.out.println("Перший елемент (iterator().next()): " + lhs.iterator().next());
        System.out.println("Вся множина: " + lhs);

        // Видалення елемента
        lhs.remove(1);
        System.out.println("Чи містить 1 після видалення? " + lhs.contains(1)); // false

        // Перевірка, чи порожня множина
        System.out.println("Чи порожня множина? " + lhs.isEmpty()); // false

        // Перебір елементів через ітератор
        Iterator<Integer> iterator = lhs.iterator();
        System.out.print("Перебір через ітератор: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Очищення множини
        lhs.clear();
        System.out.println("Після очищення, розмір: " + lhs.size()); // 0
        System.out.println("Чи порожня множина після clear()? " + lhs.isEmpty()); // true
    }
}
