package linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo(2340);
        list.printList();
        list.append(1);
        list.append(3);
        list.append(4343);
        list.append(56);
        System.out.println("\nAdding new Node");
        list.printList();

    }
}
