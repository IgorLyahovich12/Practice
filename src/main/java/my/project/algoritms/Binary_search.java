package my.project.algoritms;

import my.project.array.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Binary_search {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(35);
        list.add(77);
        list.add(435);
        list.add(52);
        list.add(-6);
        list.add(-78);
        list.add(-8);
        list.add(9);
        list.add(100);
        list.add(-911);
        list.add(-512);
        list.add(132);
        list.add(140);
        list.add(15);
        list.add(16);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,-6));


    }
}
