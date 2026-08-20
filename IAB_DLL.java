public class DoublyLinkedListForward{
  static class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  static Node IAB(Node head,int value){
    Node newNode = new Node(value);
    newNode.next = head;
    if(head != null){
      head.prev = newNode;
    }
    head = newNode;
    return head;
  }

    
  static void printLL(Node head){
    Node temp = head;
    while (temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
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
    head = IAB(head,5);
    printLL(head);
  }
}
    
