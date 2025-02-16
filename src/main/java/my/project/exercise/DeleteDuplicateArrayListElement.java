package my.project.exercise;
//Напишіть програму, яка видаляє всі дублікати з ArrayList<Integer> без використання додаткових структур даних.
import java.util.ArrayList;

public class DeleteDuplicateArrayListElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        arrList.add(10);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);

        System.out.println("До видалення дублікатів: " + arrList);

        deleteDuplicates(arrList);

        System.out.println("Після видалення дублікатів: " + arrList);
    }

    public static void deleteDuplicates(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i).equals(arrList.get(j))) {
                    arrList.remove(j);
                    j--; // щоб не пропустити наступний елемент після видалення
                }
            }
        }
    }
}
