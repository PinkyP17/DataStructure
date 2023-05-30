package Lecture.Queue.Lab;

public class Test {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[] {"Durian" ,"Blueberry"});

        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println(fruitQ.toString());

        System.out.println(fruitQ.peek());

        System.out.println(fruitQ.getSize());

        System.out.println("Deleting Durian");
        fruitQ.dequeue();

        System.out.println("Getting the 2nd index items");
        System.out.println(fruitQ.getElement(2));

        System.out.println(fruitQ.contains("Cherry"));
        System.out.println(fruitQ.contains("Durian"));

        if(!fruitQ.isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(fruitQ.toString());
        }

    }
    
}
