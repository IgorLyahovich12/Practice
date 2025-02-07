package my.project.collection.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(3);
        stack.push(25);
        stack.push(32);
        stack.push(2234);

        System.out.println(stack.search(25)+" -----місце елементу 25");
        System.out.println(stack.size()+ " розмір стеку");
        //Видаляє та повертає елемент з верхівки стека
        int top1 = stack.pop();
        System.out.println(top1);
        //Повертає (але не видаляє) елемент з верхівки стека.
        int top2 = stack.peek();
        System.out.println(top2);
        //перевіряє чи пустий
        while (!stack.isEmpty()) {

            stack.pop();
            System.out.println(stack.peek());
        }
    }
}
