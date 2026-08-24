public class G12Circular {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    static void printreverse(Node curr, Node start) {

        if (curr.next == start) {
            System.out.print(curr.data + " ");
            return;
        }

        printreverse(curr.next, start);
        System.out.print(curr.data + " ");
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        System.out.println("Reverse order:");

        printreverse(head, head);
    }
}
