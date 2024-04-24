import java.util.*;

public class LinkedList {

    class Node {
        int value;
        Node next;

        Node(int val) {
            value = val;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(int index) {
        if (head == null || index <= 0) {
            return;
        }
        if (index == 1) {
            head = head.next;
            if (head == null) {
                tail = null; // If head becomes null after removal, update tail as well.
            }
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp; // If tail is removed, update tail to the previous node.
        }
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLL();
        ll.remove(1);
        ll.printLL();
        ll.remove(3);
        ll.printLL();
    }
}
