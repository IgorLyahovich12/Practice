package my.project.collection.map;

import my.project.entity.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // LinkedHashMap зберігає порядок вставки ключів
        //виводить за індексом порядком або за використанням
        LinkedHashMap<Integer, Student> linkedHashMapStudent = new LinkedHashMap<>(16,0.75f,true);

        // Створюємо об'єкти Student
        Student st1 = new Student("Igor", "Liakhovych", 20, 3);
        Student st2 = new Student("Vasya", "Pupkin", 23, 4);
        Student st3 = new Student("Kolya", "Tyla", 23, 6);
        Student st4 = new Student("Anton", "Karp", 18, 1);
        Student st5 = new Student("Semen", "Lagoda", 20, 3);
        Student st6 = new Student("Ori", "Ivov", 19, 2);
        Student st7 = new Student("Igor", "Liakhovych", 21, 4);

        // Додаємо елементи
        linkedHashMapStudent.put(1, st1);
        linkedHashMapStudent.put(90, st2);
        linkedHashMapStudent.put(34, st3);
        linkedHashMapStudent.put(4, st4);
        linkedHashMapStudent.put(59, st5);
        linkedHashMapStudent.put(8, st6);
        }

}
