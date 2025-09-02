public class Node {
 
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Main {
    // Merge function
    public static Node mergeLists(Node l1, Node l2) {
        Node dummy = new Node(-1); 
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

     
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next; 
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
        // First sorted list: 1 -> 3 -> 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // Second sorted list: 2 -> 4 -> 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = mergeLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}


