package my.project.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("John");
        name.add("Jane");
        name.add("Mary");
        name.add("Vali");
        Iterator <String> iterator= name.iterator();//create
        //iterator =повтор
        while (iterator.hasNext()) {//check
            System.out.println(iterator.next());//give
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();

            }
            System.out.println(name);
        }

    }
}
