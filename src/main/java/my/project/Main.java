package my.project;

import my.project.array.Array;
import my.project.list.ArrList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Array();
      ArrList();
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

    public static void Array(){
        System.out.println("Hello world!");
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

}
