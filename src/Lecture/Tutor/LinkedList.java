package Lecture.Tutor;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;


    public void addFirst(E e) {
        //        e)
        //        Condition to consider:
        //        Whether the list contains any node.
        //        If it doesn't, the tail should be set to this new node.
        //
        //        f)
        //        Set the next of this firstNode to the current head.
        //        Set the head to this firstNode.
        //
        //        g)
                Node<E> firstNode = new Node<>(e);
                firstNode.next = head;
                head = firstNode;
                if (tail == null) tail = head;
    }

    public void addLast(E e){
    //        e)
    //        Condition to consider:
    //        Whether the list contains any node.
    //        If it doesn't, both the head and tail should be set to this new node.
    //
    //        f)
    //        Set the next of the current node to this new node.
    //        Set the tail to this new node.
    //
    //        g)
        if(tail==null){
            head = tail = new Node<>(e);
        }
        else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public E removeFirst(){
        //        e)
//        Condition to consider:
//        Whether the list contains any node.
//        If it doesn't, null is returned.
//        Whether the list contains only one node.
//        If so, set both the head and tail to null and return the item of that node.
//
//        f)
//        Set the head to the node after the current head.
//        Return the item of the initial head.
//
//        g)
         if(size==0) return null;
         else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head==null) tail = null;
            return temp.element;
         }
    }
    public E removeLast() {
        //        e)
        //        Condition to consider:
        //        Whether the list contains any node.
        //        If it doesn't, null is returned.
        //        Whether the list contains only one node.
        //        If so, set both the head and tail to null and return the item of that node.
        //
        //        f)
        //        Assign the node before the tail to current.
        //        Set the next of the current to null.
        //        Return the item of the initial tail.
        //
        //        g)
        if (size==0) {
            // list is empty, return null
            return null;
        } else if (size == 1) {
            // list contains only one element
            E element = tail.element;
            head = tail = null;
            size = 0;
            return element;
        } else {
            // list contains more than one element
            Node<E> current = head;
            while (current.next != tail) {
                current = current.next;
            }
            // current is now the second-to-last element
            E element = tail.element;
            tail = current;
            tail.next = null;
            size--;
            return element;
        }
    }

    public E remove(int index){
        if(index<0 || index >=size){
            return null;
        }

        else if(index == 0)
        return removeFirst();

        else{
            Node<E> previous = head;
            for(int i=1;i< index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    
}
