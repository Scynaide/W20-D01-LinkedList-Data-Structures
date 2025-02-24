package Exercises;

class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class TraverseList {

    // 1.1: Function to traverse
    public static void traverseList(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        // 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Example of traversing the node and printing
        traverseList(head);
    }
}