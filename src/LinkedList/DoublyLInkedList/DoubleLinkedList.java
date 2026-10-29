package LinkedList.DoublyLInkedList;

class Node {
    int data;
    Node next;
    Node previous;

    Node(int data){
        this.data = data;
    }
}
public class DoubleLinkedList {
    Node head;

    public void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
