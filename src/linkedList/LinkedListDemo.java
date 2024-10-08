package linkedList;

public class LinkedListDemo {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedListDemo(int value) {
        Node node1 = new Node(value);
        head = node1;
        tail = node1;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0 || head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0 || head == null) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
//        System.out.println("pre.next.value: " + pre.next.value);
//        System.out.println("temp.value: " + temp.value);
//        pre.next = null;
//        tail = pre;
        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }
}
