package my.project.queue;

import my.project.entity.Players;

import java.util.PriorityQueue;

public class PrioretyQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Players> queue = new PriorityQueue<>();
        queue.offer(new Players("Donk", "Spirit", 1.44));
        queue.offer(new Players("Zontix", "Spirit", 1.05));
        queue.offer(new Players("ZywOo", "Vitality", 1.43));
        queue.offer(new Players("mONESY", "G2", 1.15));
        queue.offer(new Players("Niko", "Falcons", 1.10));
        queue.offer(new Players("Bit", "Navi", 1.26));
        queue.offer(new Players("Im", "Navi", 1.16));
        queue.offer(new Players("Jl", "Navi", 1.12));
        queue.offer(new Players("Ropz", "Vitality", 1.16));
        queue.offer(new Players("Twistzz", "Liquid", 1.17));
        queue.offer(new Players("Faze", "Elige", 0.99));
        queue.offer(new Players("Nertz", "Liquid", 1.23));
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue.peek()+" Гравець");
        queue.poll();//виделення з черги
        System.out.println(queue);
        }
    }

