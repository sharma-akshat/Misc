package linkedList;
class ReversingLinkedList
{
    static Node head;
    static class Node{
        Node next;
        int data;
        Node(int value)
        {
            data=value;
            next=null;
        }
   }
    public void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public Node reversedList(Node node)
    {
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }
    public static void main(String gg[])
    {
        ReversingLinkedList ll=new ReversingLinkedList();
        ReversingLinkedList.head=new Node(85);
        ReversingLinkedList.head.next=new Node(15);
        ReversingLinkedList.head.next.next=new Node(4);
        ReversingLinkedList.head.next.next.next=new Node(20);
        System.out.println("Created Linked list is :");
        ll.printList(head);
        System.out.println("");
        System.out.println("Reversed list is :");
        head=ll.reversedList(head);
        ll.printList(head);
    }
}