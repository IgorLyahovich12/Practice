package my.project.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
        queue.add("Igor");
        queue.add("Nadya");
        queue.add("Nasty");
        //if queue have limit and more elements than the limit have been added,Add throws an exceptions
        queue.add("Via");
        //if queue have limit and more elements than the limit have been added,Add dont throws an exceptions
        queue.offer(" Katya");
        System.out.println(queue +" черга");
        System.out.println(queue.element()+" Перший елемент");
        System.out.println(queue.remove()+" Елемент цей видаляється");
        System.out.println(queue +" черга");
        System.out.println(queue.element()+" Перший елемент");
        System.out.println(queue.remove()+" Елемент цей видаляється");
        System.out.println(queue +" черга");
        System.out.println(queue.element()+" Перший елемент");
        System.out.println(queue.remove()+" Елемент цей видаляється");
        System.out.println(queue +" черга");
        System.out.println(queue.element()+" Перший елемент");
        System.out.println(queue.remove()+" Елемент цей видаляється");
        System.out.println(queue +" черга");
        System.out.println(queue.remove()+" Елемент цей видаляється");
        System.out.println(queue +" черга");
        //.NoSuchElementException  if uses element when queue is Empty
        //System.out.println(queue.element()+" Перший елемент");
        //no exceptions ,output zero
        System.out.println(queue.peek()+" Перший елемент");
        queue.add("Igor");
        queue.add("Nazar");
        System.out.println(queue.peek()+" Перший елемент");
        //.NoSuchElementException if uses remove when queue is Empty
     //   System.out.println(queue.remove());
      //  System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
