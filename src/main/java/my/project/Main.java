package my.project;

import my.project.array.Array;
import my.project.collection.list.ArrList;
import my.project.collection.list.LinkList;
import my.project.collection.map.HashMapp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Array();
      ArrList();
      List();
      HashMapp();
    }
    public  static void ArrList(){
        ArrList arrList = new ArrList();

        arrList.addName("David");
        arrList.printNames();
        System.out.println("Чи є 'Alice' у списку? " + arrList.containsName("Alice"));
        arrList.removeName("Bob");
        arrList.printNames();
        arrList.clearNames();
        arrList.printSize();
    }
    public static void List() {
        // Створюємо об'єкт LinkList
        LinkList linkList = new LinkList();

        // Додаємо нову фразу
        linkList.addPhrase("Keep moving forward");
        // Видаляємо фразу
        linkList.removePhrase("Stay");
        // Перевіряємо, чи є фраза у списку
        System.out.println("Чи є фраза 'Dont stop'? " + linkList.containsPhrase("Dont stop"));
        // Отримуємо фразу за індексом
        System.out.println("Фраза під індексом 2: " + linkList.getPhraseByIndex(2));
        // Оновлюємо фразу
        linkList.updatePhrase(1, "Never give up");
        // Виводимо всі фрази
        System.out.println("Весь список фраз: " + linkList.getPhrase());

        // Очищуємо список
        linkList.clearPhrase();

        // Перевіряємо розмір після очищення
        linkList.printSize();
    }
    public static void Array(){
        int k = 0;
        int key = 7;
        Array arrayInstance = new Array();
        System.out.println(Arrays.toString(arrayInstance.matrix));
        for (int i = 0; i < arrayInstance.secondMatrix.length; i++) {
            System.out.print(arrayInstance.secondMatrix[i]+" - "+i);
            System.out.println(" element");
        }
        int number=arrayInstance.secondMatrix[0];
        System.out.println(number);
        Arrays.sort(arrayInstance.secondMatrix);
        System.out.println("Відсортований масив: " + Arrays.toString(arrayInstance.secondMatrix));
        int index = Arrays.binarySearch(arrayInstance.secondMatrix, key);
        if (index >= 0) {
            System.out.println("Елемент " + key + " знайдено за індексом: " + index);
        } else {
            System.out.println("Елемент " + key + " не знайдено. Його можна вставити на позицію: " + (-index - 1));
        }
        System.arraycopy(arrayInstance.secondMatrix, 0, arrayInstance.matrix, 0, arrayInstance.secondMatrix.length);
        Arrays.fill(arrayInstance.secondMatrix, 7);
        for (int i = 0; i < arrayInstance.secondMatrix.length; i++) {
            System.out.print(arrayInstance.secondMatrix[i]+" - "+i);
            System.out.println(" element");
        }
        String arrayAsString = Arrays.toString(arrayInstance.secondMatrix);
        System.out.println(arrayAsString); // Виведе: [1, 2, 3, 4, 5]
        int element = arrayInstance.thirdMatrix[1][2]; // Отримаємо значення 6
        System.out.println(element);
        for (int i = 0; i < arrayInstance.thirdMatrix.length; i++) {
            for (int j = 0; j < arrayInstance.thirdMatrix[i].length; j++) {
                System.out.print(arrayInstance.thirdMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public  static void HashMapp(){
        HashMapp hashMapp = new HashMapp();
        hashMapp.addMap(8, "Alan");
        hashMapp.addMap(9, "Bob");
        hashMapp.addMap(10, "Alice");
        hashMapp.addMapIfAbsent(10,"Kira");
        hashMapp.addMapIfAbsent(11,"Sergey");
        hashMapp.printValueByKey(8);
        hashMapp.containsKeyMap(9);
        hashMapp.containsValueMap("Dan");
        hashMapp.deleteMap(10);
        hashMapp.printAllKeys();
        hashMapp.printAllValues();

    }

}
