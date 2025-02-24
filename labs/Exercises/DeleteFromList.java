package Exercises;

import java.util.LinkedList;

public class DeleteFromList {

        Node head; // head of list

        /* Linked list Node*/
        class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        void deleteNode(int key)
        {
            // Store head node
            Node temp = head, prev = null;

            // If head node itself holds the key to be deleted
            if (temp != null && temp.data == key) {
                head = temp.next; // Changed head
                return;
            }

            // Search for the key to be deleted, keep track of
            // the previous node as we need to change temp.next
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            // If key was not present in linked list
            if (temp == null)
                return;

            // Unlink the node from linked list
            prev.next = temp.next;
        }


        public void push(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }


        public void printList()
        {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }


        public static void main(String[] args)
        {
            DeleteFromList list = new DeleteFromList();

            list.push(7);
            list.push(1);
            list.push(3);
            list.push(2);

            System.out.println("Created Linked list is: ");
            list.printList();

            list.deleteNode(1); // Delete node with data 1

            System.out.println("Linked List after Deletion of 1: ");
            list.printList();
        }
    }
