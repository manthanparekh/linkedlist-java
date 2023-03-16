public class LinkedList {

    // A global variable.
    static Node head;

    /**
     * A Node object has an integer data field and a Node reference field.
     */
    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    // Creating a linked list with 4 nodes.
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(90);
        list.head.next = new Node(4);
        list.head.next.next = new Node(7);       
        list.head.next.next.next = new Node(22);
        list.head.next.next.next.next = new Node(55);
        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}