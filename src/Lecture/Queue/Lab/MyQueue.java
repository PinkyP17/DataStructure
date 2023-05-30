package Lecture.Queue.Lab;
import java.util.*;

public class MyQueue<E> {
    private LinkedList<E> list;

    public MyQueue(E[] e) {
        list = new LinkedList<E>(Arrays.asList(e));
    }

    public MyQueue(){
        list = new LinkedList<E>();
    }

    public void enqueue(E e){
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getElement(int i){
        return list.get(i);
    }

    public E peek(){
        return list.peekFirst();
    }

    public int getSize(){
        return list.size();
    }

    public boolean contains(E e){
        return list.contains(e);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
    
}
