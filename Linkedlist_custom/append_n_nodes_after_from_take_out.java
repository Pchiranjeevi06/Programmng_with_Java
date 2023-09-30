package Linkedlist_custom;

public class append_n_nodes_after_from_take_out
{

    public static void main (String[]args) throws Exception
    {
        LinkedList1 ll = new LinkedList1 ();
        ll.addFirst (60);
        ll.addFirst (50);
        ll.addFirst (40);
        ll.addFirst (30);
        ll.addFirst (20);
        ll.addFirst (10);

        ll.display ();

        ll.appendToFront (3);

        ll.display ();
    }

}

class LinkedList1
{
    private class Node
    {
        int data;
        Node next;

        // Node constructor
// There are two fields in the node- data and address of next node
        public Node (int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Linked list constructor
    public LinkedList1 ()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    // Function to find the size of linked list
    public int size ()
    {
        return this.size;
    }

    // Function to check whether linked list is empty or not
    public boolean isEmpty ()
    {
        return this.size () == 0;
    }

    // Function to traverse and print the linked list
    public void display ()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print (temp.data + ">");
// Set temp to point to the next node
            temp = temp.next;
        }
        System.out.println ("END");
    }

    // Function to add a node in beginning of linked list
    public void addFirst (int item)
    {
// Create a temp node which points to head
        Node temp = new Node (item, head);

// If linked list is empty, temp is the head and tail node both
        if (this.size == 0)
        {
            this.head = this.tail = temp;
        }

// else set the head such that it now points to temp node
        else
        {
            this.head = temp;

        }

        this.size++;
    }

    public int kthFromLast (int k)
    {
        return this.kthNodeFromLast (k).data;

    }

    // Function to find kth node from last
    private Node kthNodeFromLast (int k)
    {

// Take slow and fast pointers
        Node slow = this.head;
        Node fast = this.head;

// First move fast pointer k nodes from the head
        for (int i = 0; i < k; i++)
        {
            fast = fast.next;
        }

// Move both slow and fast by one till fast becomes null
        while (fast != null)
        {
            fast = fast.next;
            slow = slow.next;

        }

// Slow pointer points to the nth node from last
        return slow;
    }

    public void appendToFront (int n)
    {

// Find (n+1)th node from last
        Node np1 = this.kthNodeFromLast (n + 1);

// Find the nth node from beginning
        Node nth = np1.next;

// Set the pointers of node
        np1.next = null;
        this.tail.next = this.head;

        this.head = nth;
        this.tail = np1;
    }
}