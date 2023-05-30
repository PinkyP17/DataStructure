package Lecture.DoublyLinkedList;

public class Node<E> {
    E element;
    Node<E> next;
    Node<E> prev;

    public Node(E element, Node next, Node prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public Node(E element){
        this.element = element;
        this.next = this.prev = null;
    }
    
}
