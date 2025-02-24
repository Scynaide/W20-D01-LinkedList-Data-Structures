# Lab: Linked List Exercises

## Objective
In this lab, you will practice working with linked lists by solving problems that require modifying, reversing, and analyzing linked list structures. You will implement these solutions in Java and test them using the provided LeetCode links.

---

## Instructions

### 1. Understanding Linked Lists
- Review the concept of singly linked lists, including how to traverse, modify, and delete nodes.
- Make sure you understand how linked list nodes are structured in Java:

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
```

### 2. Solve the Following Problems

#### Problem 1: Delete Node in a Linked List
- **Instructions:** You are given a node in a singly linked list (excluding the tail). Your task is to delete it without access to the head. Since you cannot modify the previous node, you need to copy the next node’s value into the given node and delete the next node instead.
- **Test your solution:** [Here](https://leetcode.com/problems/delete-node-in-a-linked-list/)

#### Problem 2: Reverse a Linked List
- **Instructions:** Given the head of a singly linked list, reverse the list and return the new head. Implement both iterative and recursive approaches to understand their differences.
- **Test your solution:** [Here](https://leetcode.com/problems/reverse-linked-list/)

#### Problem 3: Remove Nth Node From End of List
- **Instructions:** Given the head of a linked list, remove the Nth node from the end of the list and return its head. Use a two-pointer technique to efficiently find the node without needing extra space.
- **Test your solution:** [Here](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

### 3. Bonus Problem

#### Problem 4: Linked List Cycle Detection
- **Instructions:** Given the head of a linked list, determine if the list has a cycle. Use Floyd’s Cycle Detection Algorithm (slow and fast pointers) to detect cycles efficiently.
- **Test your solution:** [Here](https://leetcode.com/problems/linked-list-cycle/description/)

---

## Submission Guidelines
1. Implement each problem in a separate Java file or a single Java class with different methods.
2. Write test cases to validate your solutions.
3. Submit your completed solutions along with any test cases and explanations.

Good luck, and happy coding!

