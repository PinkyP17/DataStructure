package Lecture.Queue.Lecture;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        System.out.println("Priority queue using compareable: ");
        while(queue1.size() > 0){
            System.out.println(queue1.poll()+ " ");
        }


        PriorityQueue<String> queue2 = new PriorityQueue<>(4,Collections.reverseOrder());
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        System.out.println("Priority queue using compareable: ");
        while(queue1.size() > 0){
            System.out.println(queue1.poll()+ " ");
        }
    }
    
}
