package Lecture.Tutor;

import javax.print.attribute.standard.Chromaticity;

public class q1<E> {
    public static void main(String[] args) {
        //a
        LinkedList<Character> list = new LinkedList<>();
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');

        list.head = node1;
        list.tail = node2;
        

        //b 
        /*
         *  |Node1| - |Node2|
         */
        //c
         node1.next = node2;

         //d
         Node<Character> firstNode = new Node<>('f');
         firstNode.next = list.head;
         list.head = firstNode;

         /*
          *     |f| -> |a| -> |z|
                head          tail
          */

          //e
          /*
           * 1. Check whether the linked is is empty or not, if its empty
           * then we need to make sure the head and tail reference are toward
           * the only node that exist
           * 
           * 2. If linked-list not empty, we need to update the next to make sure the
           * firstNode would be the head and make the old head to be the next pointer
           * for the firstNode
           */


        }

}


