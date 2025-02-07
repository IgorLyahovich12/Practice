package my.project.collection.list;
//now not used in production
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Работа с вектором String
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");

        System.out.println(v.get(3));  // Вывод элемента с индексом 3
        System.out.println(v.size());  // Вывод размера вектора
        System.out.println(v.remove(2));  // Удаление элемента по индексу
        v.clear();  // Очищение вектора
        System.out.println("Вектор очищен: " + v.size());  // Проверка размера вектора после очистки
    }
}

class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    @Override
    public String toString() {
        return "Vector3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public static void main(String[] args) {
        // Работа с векторами в 3D
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);
        Vector3D v3 = v1.add(v2);
        System.out.println("Сложение векторов: " + v3);  // Вывод результата сложения векторов
    }
}
