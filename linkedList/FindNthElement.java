package linkedList;
class FindNthElement
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int value)
        {
            data=value;
            next=null;
        }
    }
    public int findNthElement(int index)
    {
        Node current=head;
        int count=0;
        while(current!=null)
        {
            if(count==index)
            {
                return current.data;
            }
            count++;
            current=current.next;
        }
        return -1;
    }
    public void push(int data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String gg[])
    {
        FindNthElement fe=new FindNthElement();
        fe.push(10);
        fe.push(20);
        fe.push(2);
        fe.push(13);
        fe.push(25);
        fe.push(20);
        System.out.println("Element at index 5 is : "+fe.findNthElement(5));
    }
}