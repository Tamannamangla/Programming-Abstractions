public class ReverseInGroups {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseInGroups(Node head, int k) {

        if (head == null || k <= 1) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;

        int count = 0;
        while (curr != null && count < k) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

            count++;
        }
        if (next != null) {
            head.next = reverseInGroups(next, k);
        }

        return prev;
    }

    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int k = 2;

        System.out.println("Original list:");
        printList(head);

        head = reverseInGroups(head, k);

        System.out.println("After reversing in groups:");
        printList(head);
    }
}
