package my.project.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ArrList {
    private List<String> names = new ArrayList<>();
    private String name = "Igor";
    private List<String> cities = List.of("Kyiv", "Lviv", "Odessa"); // Незмінний список
    private List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry"); // Незмінний список
    private StringBuilder France=new StringBuilder("Paris");
    private StringBuilder France1=new StringBuilder("Monaco");
    private StringBuilder France2=new StringBuilder("Marseille");
    private StringBuilder France3=new StringBuilder("Lion");
    StringBuilder[] array={France,France1,France2,France3};
    List<StringBuilder> list =Arrays.asList(array);
    public ArrList() {
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add(2,"Caull");
        names.add(name);
        printSize();
        System.out.println(list);
        array[0]=new StringBuilder("F");
        System.out.println(array[0]);
    }

    // Метод для виведення розміру списку
    public void printSize() {
        int scale = names.size();
        if (names.isEmpty()) {
            System.out.println("zero");
        } else {
            System.out.println("Розмір списку: " + scale);
        }
    }

    // Метод для додавання нового імені в список
    public void addName(String newName) {
        names.add(newName);
        System.out.println(newName + " додано до списку.");
    }

    // Метод для видалення імені зі списку
    public void removeName(String nameToRemove) {
        if (names.remove(nameToRemove)) {
            System.out.println(nameToRemove + " видалено зі списку.");
        } else {
            System.out.println(nameToRemove + " не знайдено.");
        }
    }

    // Метод для перевірки, чи є ім'я у списку
    public boolean containsName(String searchName) {
        return names.contains(searchName);
    }

    // Метод для виведення всіх імен у списку
    public void printNames() {
        System.out.println("Імена у списку: " + names);
    }

    // Метод для очищення списку
    public void clearNames() {
        names.clear();
        System.out.println("Список імен очищено.");
    }
}