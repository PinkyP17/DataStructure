package Lecture;
public class LinkedList {
    public static void main(String[] args) {
        Node<String> head = null;
        Node<String> tail = null;

        head = new Node<>("Chicago");
        tail = head;

        tail.next = new Node<>("Denver");
        tail = tail.next;

        tail.next = new Node<>("Dallas");
        tail = tail.next;

        printNode(head);
        

        //addFirst(E e)
    
} 
        

      
    
    //method to print out all the node until the end 
    //[because once it reach the end the value would be null]
    public static <T> void printNode(Node<T> node) {
        Node<T> current = node;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

  
}


