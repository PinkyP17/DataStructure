package Lecture.DoublyLinkedList;

import java.util.NoSuchElementException;

import javax.xml.transform.Source;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }

    //add first 
    public void addFirst(E element){
        Node<E> tmp = new Node(element, head, null);
        if(head != null){
            head.prev = tmp;
        }
        head = tmp;
        if(tail == null){
            tail = tmp;
        }
        size++;
        System.out.println("adding: "+element);
       

    }

    //add last at the node
    public void addLast(E element){
        Node<E> tmp = new Node(element, null, tail);
        if(tail!=null){
            tail.next = tmp;
        }
        tail = tmp;
        if(head==null){
            head=tmp;
        }
        size++;
        System.out.println("adding: "+ element);
    }


    //add node in the middle
    public void add(int index, E element){
        //index too big or negative index
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        //index is 0 
        if(index==0){
            addFirst(element);
        }

        //index same size as the list
        else if(index==size){
            addLast(element);
        }

        else{
            /*  Set from head and begin traverse
             *  stop on required position */
            Node<E> temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }

            Node<E> insert = new Node(element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
             
        }
       
    }

    //Traversing forward
    public void iterateForward(){
        System.out.println("iterating forward...");
        Node<E> tmp = head;

        while(tmp!=null){
            System.out.print(tmp.element);
                System.out.println(" ");
            tmp = tmp.next;
        }
    }

    //traversing backward
    public void iterateBackward(){
        System.out.println("iterating backward...");
        Node<E> tmp = tail;

        while(tmp!=null){
            System.out.print(tmp.element);
                System.out.println(" ");
            tmp = tmp.prev;
        }
    }

    //delete first node
    public E removeFirst(){
        if(size==0){
            throw new NoSuchElementException();
        }

        Node<E> tmp = head;
        //head.next become the new head
        head=head.next;
        //severe connection, setting the pointer of prev to null
        head.prev = null;
        //reduce node num
        size--;
        System.out.println("deleted: "+ tmp.element);
        return tmp.element;
    }

    //delete last node
    public E removeLast(){
        if(size==0){
            throw new NoSuchElementException();
        }
        Node<E> tmp = tail;
        //node before tail become new tail
        tail = tail.prev;
        //severe connection of the tail and new last node [since new tail are already in place, we delete the connection the next last node the one]
        //which we want to delete
        tail.next = null;
        //size reduce
        size--;
        System.out.println("deleted: "+ tmp.element);
        return tmp.element;
    }

    //delete intermediate node
    public E remove(int index){
        E element = null;
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            element = removeFirst();
        }
        else if(index == size-1){
            element = removeLast();
        }
        else{
            Node<E> temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return element;
    }

    //clear All nodes in the list
    public void clear(){
        Node<E> temp = head;
        while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size =0;
    }
    
}
