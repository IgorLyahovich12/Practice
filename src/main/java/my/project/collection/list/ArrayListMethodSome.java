package my.project.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodSome {
    public static void main(String[] args) {
      List<String> name=new ArrayList<>();
      name.add("John");
      name.add("Jane");
      name.add("Mary");
      name.add("Vali");
        System.out.println(name);
        //method for copy some elements on another ArrList
        List<String> myList=name.subList(0,2);
        System.out.println(myList);
        //if we plus new element in arrList who copy from another list(subList)?,another list also getting this element
        //if we plus new element in arrList and we have subList we getting exceptions
        myList.add("kolya");
        System.out.println(myList);
        System.out.println(name);
        List<String> name2=new ArrayList<>();
        name2.add("John");
        name2.add("Jane");
        name2.add("Bob");
        //method for removed all element who similar
        name.removeAll(name2);
        System.out.println(name);
        List<String> name3=new ArrayList<>();
        name3.add("John");
        name3.add("Mary");
        name3.add("Vali");
        //method for output similar element
        name3.retainAll(name);
        System.out.println(name3);
        List<String> name4=new ArrayList<>();
        name4.add("John");
        name4.add("Mary");
        name4.add("Vali");
        //method for check two List is similar or no
        System.out.println(name4.containsAll(name3));

    }

}
