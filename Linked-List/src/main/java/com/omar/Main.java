package com.omar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(8);

        System.out.println(myLinkedList);

        ArrayList<Integer> myArrayList = new ArrayList<>(myLinkedList);

        System.out.println(myArrayList.get(1));

        System.out.println(myLinkedList.get(1));


        /*
        indexing in Arraylist vs linkedList

        ArrayList: O(1)
        LinkedList: O(n)

        Adding to the beginning:

        ArrayList: O(n)
        LinkedList: O(1)
        * */


//       100 9 1 4 7

        SingleNode head = new SingleNode(9);
        SingleNode A = new SingleNode(1);
        SingleNode B = new SingleNode(4);
        SingleNode C = new SingleNode(7);
        SingleNode D = new SingleNode(7);
        SingleNode E = new SingleNode(8);


        head.next= A;
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
//        System.out.println(head);
//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);

//        System.out.println(head.next);

//        Traversing through the linked list

        SingleNode current = head;

        while(current != null){
            System.out.println(current);
            current = current.next;
        }

        display(A);

        System.out.println(search(head,6));

        System.out.println(head.next.next);
        display(head);

        display(deleteDuplicates(head));

    }

//    display all values
    public static void display(SingleNode head){
        SingleNode current = head;

        List<String> elements = new ArrayList<>();

        while(current != null){
            elements.add(Integer.toString(current.value));
            current = current.next;
        }

        System.out.println(String.join("->",elements));


        DoublyNode doublyHead = new DoublyNode(1);
        DoublyNode H = new DoublyNode(2);
        DoublyNode I = new DoublyNode(3);
        DoublyNode J = new DoublyNode(4);
        DoublyNode K = new DoublyNode(5);
        DoublyNode L = new DoublyNode(6);

        doublyHead.next = H;
        H.prev = doublyHead;
        H.next = I;
        I.prev = H;
        I.next = J;




    }

//    search if an element exists in our linkedlist

    public static boolean search(SingleNode head, int value){
        SingleNode current = head;

        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static SingleNode deleteDuplicates(SingleNode head) {
        SingleNode current = head;

        while(current != null && current.next != null){
            if(current.value == current.next.value){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}
