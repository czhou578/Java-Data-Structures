package src;

public class LinkedList {
  
  public static void printList(Node Nodehead) {
    Node ptr = Nodehead;
    while (ptr.next != null) {
      System.out.println(ptr.data);
      ptr = ptr.next;
    }
    System.out.println(ptr.data);
  }

  public static Node constructList() {
    Node first = new Node(6);
    Node second = new Node(3);
    Node third = new Node(8);
    Node fourth = new Node(7);

    Node head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    return head;
  }

  public static void main(String[] args) {
    Node head = constructList();
    printList(head);
  }
}
