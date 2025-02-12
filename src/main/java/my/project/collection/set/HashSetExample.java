package my.project.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(17);
        set.add(21);
        set.add(38);
        set.add(4);
        set.add(52);
        set.add(60);
        set.add(7);
        set.add(800);
        set.add(94);
        set.add(10);
        set.add(112);
        set.add(192);
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
        System.out.println(set.size()+" elements in the hashSet");
        System.out.println(set.isEmpty());
        System.out.println(set.contains(192));
        Set<Integer> set2 = new HashSet<>();
        set2.add(111);
        set2.add(222);
        set2.add(333);
        set2.add(444);
        set.addAll(set2);
        System.out.println(set);
        System.out.println(set.size()+" elements in the hashSet");
        Set<Integer> set3 = new HashSet<>();
        set3.add(111);
        set3.add(222);
        set3.add(3313);
        set3.add(4414);
        Set<Integer> set4 = new HashSet<>(set2);
        set4.retainAll(set3);
        System.out.println(set4);
        System.out.println(set4.size()+" elements in the hashSet");
        set.removeAll(set);
        System.out.println(set);
    }
}
