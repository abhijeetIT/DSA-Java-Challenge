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

        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
    }

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

    public void delete(int pos){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        int size = size();

        if (pos < 1 || pos > size){
            System.out.println("Invalid position..");
            return;
        }

        if (pos == 1){
            head = head.next;
        }else{
            Node previous = head;
            for (int i = 2 ; i < pos ; i++){
                previous = previous.next;
            }
            previous.next = previous.next.next;
        }
        System.out.println("deleted successfully.");
    }

    public void removeDuplicates(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp.next != null){ // 1 2 2 3 4 4
            if (temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        System.out.println("Duplicates Removed..");
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insert(10);
        list.insert(10);
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(50);
        list.insert(50);

        list.print();
        list.removeDuplicates();
        list.print();

    }
}
