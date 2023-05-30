package Lecture.Queue.Lecture;

public class TestGenericQueue {
public static void main(String[] args) {
        GenericQueue<String> test = new GenericQueue<>();

        //adding an element to the queue
        test.enqueue("Tom");
        System.out.println("(7) " + test);

        test.enqueue("Susan");
        System.out.println("(8) " + test);

        test.enqueue("Kim");
        test.enqueue("Micheal");
        System.out.println("(9) " + test);
        

        //Remove elements from the queue
        System.out.println("(10) " + test.dequeue());
        System.out.println("(11) " + test.dequeue());
        System.out.println("(12) " + test);
    }
}
