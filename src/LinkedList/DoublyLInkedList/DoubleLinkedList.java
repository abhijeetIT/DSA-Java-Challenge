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


    public int size(){
        if (head == null){
            return 0;
        }

        Node temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
