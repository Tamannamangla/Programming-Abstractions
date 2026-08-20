public class DoublyLinkedListForward{
  static class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  static void printForward(Node head){
    Node temp = head;
    while (temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
  static Node deleteFirstNode(Node head){
    if (head == null) {
        return null;
    }
    head = head.next;
    if (head != null) {
        head.prev = null;
    }
    return head;
    // Node temp = head.next;
    // temp.prev = null;
    // head = temp;
    // return head;
  }
  
  public static void main(String[] args){
    Node head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);
    
    head.next = second;
    second.prev = head;
    second.next = third;
    third.prev = second;
    third.next = fourth;
    fourth.prev = third;
    
    System.out.println("Before deletion:");
    printForward(head);
    head = deleteFirstNode(head)
    System.out.println("After deletion:");
    printForward(head);
  }
}
    
