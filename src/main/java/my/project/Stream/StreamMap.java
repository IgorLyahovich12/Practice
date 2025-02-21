package my.project.Stream;

import my.project.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student st1=new Student( "Igor","Liakhovych",21,4);
        Student st2 = new Student("Anna", "Shevchenko", 20, 3);
        Student st3 = new Student("Oleh", "Kovalenko", 22, 5);
        Student st4 = new Student("Maria", "Petrenko", 19, 2);
        Student st5 = new Student("Dmytro", "Bondarenko", 23, 6);
        Student st6 = new Student("Sofia", "Tkachenko", 21, 4);
        Student st7 = new Student("Andriy", "Melnyk", 20, 3);
        Student st8 = new Student("Kateryna", "Lysenko", 22, 5);
        Student st9 = new Student("Vladyslav", "Krivenko", 18, 1);
        Student st10 = new Student("Iryna", "Horobets", 19, 2);
        Student st11 = new Student("Yaroslav", "Dovzhenko", 24, 6);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.add(st7);
        list.add(st8);
        list.add(st9);
        list.add(st10);
        list.add(st11);
        list.stream().map(Student::getAge).sorted().forEach(System.out::println);
        List<String> list1=new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Java");
        list1.add("StreamMap");
        list1.add("how are you");
        List<Integer> list2=  list1.stream().map(word->word.length()).
                toList();
        System.out.println(list2);
        String Arr[]={"Hello","my","name","is","Ihor"};
        String sentence = Arrays.stream(Arr).collect(Collectors.joining(" "));
        System.out.println(sentence);


    }
}
