package my.project.collection.list;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s="madam";

        List<Character> list=new LinkedList<>();
       for (char ch:s.toCharArray()){
           list.add(ch);
       }
       ListIterator<Character> listIterator=list.listIterator();
       ListIterator<Character> reverseIterator=list.listIterator(list.size());
       boolean isPalindrome=true;
       while(listIterator.hasNext()&&reverseIterator.hasPrevious()){
           if(listIterator.next()!=reverseIterator.previous()){
               isPalindrome=false;
               break;
           }

       }
       if(isPalindrome){
           System.out.println("Palindrome");
       }
       else{
               System.out.println("Not a palindrome");
           }
        List<String> name=new LinkedList<>();
        name.add("John");
        name.add("Jane");
        name.add("Mary");
        name.add("Vali");
        ListIterator<String> iterator= name.listIterator(name.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        }

}
