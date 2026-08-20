public class DoublyLinkedList{
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

  static Node reverse(Node head){
    Node curr = head;
    Node newNode = null;

    while(curr != null){
      Node temp = curr.prev;
      curr.prev = curr.next;
      curr.next = temp ;
      newNode = curr;
      curr = curr.prev;
    }
    return newNode;
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
    printForward(head);
    head = reverse(head);
    printForward(head);
  }
}
    
