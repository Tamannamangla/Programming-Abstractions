public class NthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int nthNodeFromEnd(Node head, int n) {

        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        System.out.println("Nth node from end: "
                + nthNodeFromEnd(head, n));
    }
}
