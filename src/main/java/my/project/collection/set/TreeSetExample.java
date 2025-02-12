package my.project.collection.set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        //null не можна
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10); // Дублікати ігноруються

        // Вивід елементів (відсортовані за зростанням)
        System.out.println("TreeSet: " + numbers);

        System.out.println("Містить 10? " + numbers.contains(10));

        numbers.remove(5);
        System.out.println("Після видалення 5: " + numbers);


        System.out.println("Перший елемент: " + numbers.first());
        System.out.println("Останній елемент: " + numbers.last());


        System.out.println("Елементи менше 15: " + numbers.headSet(15));
        System.out.println("Елементи від 10 (включно) до 20: " + numbers.subSet(10, true, 20, true));

        // Витягування та видалення першого та останнього елемента
        System.out.println("Видалено перший елемент: " + numbers.pollFirst());
        System.out.println("Видалено останній елемент: " + numbers.pollLast());

        // Ітерація по елементах
        System.out.println("Залишилися елементи:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
