package my.project.queue;

import my.project.entity.Players;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Players> deque = new ArrayDeque<Players>();
        deque.offerFirst(new Players("Donk", "Spirit", 1.44));
        deque.offerLast(new Players("Zontix", "Spirit", 1.05));
        deque.offerLast(new Players("ZywOo", "Vitality", 1.43));
        deque.offerFirst(new Players("mONESY", "G2", 1.15));
        deque.offerLast(new Players("Niko", "Falcons", 1.10));
        deque.offerFirst(new Players("Bit", "Navi", 1.26));
        deque.offerLast(new Players("Im", "Navi", 1.16));
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

    }
}
