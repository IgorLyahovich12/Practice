package my.project.collection.map;

import my.project.entity.Student;
import java.util.TreeMap;


public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Student> treeMapStudent = new TreeMap<>();

        // Створюємо об'єкти Student
        Student st1 = new Student("Igor", "Liakhovych", 20, 3);
        Student st2 = new Student("Vasya", "Pupkin", 23, 4);
        Student st3 = new Student("Kolya", "Tyla", 23, 6);
        Student st4 = new Student("Anton", "Karp", 18, 1);
        Student st5 = new Student("Semen", "Lagoda", 20, 3);
        Student st6 = new Student("Ori", "Ivov", 19, 2);
        Student st7 = new Student("Igor", "Liakhovych", 21, 4);

        // Додаємо елементи в TreeMap
        treeMapStudent.put(1, st1);
        treeMapStudent.put(90, st2);
        treeMapStudent.put(34, st3);
        treeMapStudent.put(4, st4);
        treeMapStudent.put(59, st5);
        treeMapStudent.put(8, st6);

        // Додає елемент, якщо ключ 1 не існує (але він вже є, тому нічого не зміниться)
        treeMapStudent.putIfAbsent(1, st7);

        // Виводимо весь TreeMap
        System.out.println(treeMapStudent);

        // Отримуємо об'єкт за ключем 4
        System.out.println(treeMapStudent.get(4));

        // Видаляємо елемент з ключем 90
        treeMapStudent.remove(90);

        // Виводимо TreeMap у зворотному порядку
        System.out.println(treeMapStudent.descendingMap());

        // Виводимо всі елементи, починаючи з ключа 34
        System.out.println(treeMapStudent.tailMap(34));

        // Виводимо всі елементи до ключа 34
        System.out.println(treeMapStudent.headMap(34));

        // Отримуємо перший індекс
        System.out.println(treeMapStudent.firstEntry());

        // Отримуємо останній індекс
        System.out.println(treeMapStudent.lastEntry());
    }
}
