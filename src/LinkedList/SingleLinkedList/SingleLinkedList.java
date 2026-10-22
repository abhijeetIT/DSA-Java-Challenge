package LinkedList.SingleLinkedList;


class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class SingleLinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
            return;
        }

//        Node temp = head;
//        while(){
//
//        }
    }

    public void print(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insert(10);
        list.print();
    }

}
