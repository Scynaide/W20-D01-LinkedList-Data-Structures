package com.omar;

public class DoublyNode {
    int value;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "value=" + value +
                '}';
    }
}
