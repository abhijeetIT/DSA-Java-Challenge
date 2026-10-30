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

    public void insert(int data){
        Node node = new Node(data);

        if (head==null){
            head = node;
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        node.previous = temp ;
        temp.next = node;
    }

    public void insert(int data, int pos) {

        int size = size();

        if (pos < 1 || pos > size + 1) {
            return;
        }

        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        if (pos == 1) {
            node.next = head;
            head.previous = node;
            head = node;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {

            node.previous = temp;
            temp.next = node;

        } else {
            node.previous = temp;
            node.next = temp.next;

            temp.next.previous = node;
            temp.next = node;
        }
    }

    public void delete(int pos) {

        int size = size();

        if (head == null || pos < 1 || pos > size) {
            return;
        }

        // First node
        if (pos == 1) {

            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
                head.previous = null;
            }
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // Last node
        if (temp.next == null) {

            temp.previous.next = null;

        } else {

            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
    }

    public void sort(){
        if (head == null || head.next == null){
            return;
        }

        int size = size();

        Node temp,temp2;
        for (int i = 0 ; i < size-1 ; i++){
            temp = head;
            temp2 = head.next;

            for (int j = 0 ; j < size-i-1 ; j++){
                if (temp.data > temp2.data){
                    int data = temp.data;
                    temp.data = temp2.data;
                    temp2.data = data;
                }
                temp = temp2;
                temp2 = temp2.next;
            }
        }
    }


    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();

        dll.insert(10);
        dll.insert(20,2);
        dll.insert(1);
        dll.insert(0);
        dll.insert(100);
        dll.insert(40);

        dll.print();

        dll.sort();

        dll.print();










//        Scanner scanner = new Scanner(System.in);
//        int input;
//        do{
//            System.out.println("================MENU=================");
//            System.out.println("0. Exit");
//            System.out.println("1. Inset");
//            System.out.println("2. Print");
//            System.out.println("3. Delete");
//            System.out.println("4. Remove Duplicate");
//            System.out.println("5. Sort");
//            System.out.println("6. Merge");
//            System.out.println("===================================");
//
//            System.out.print("Enter Your choose: ");
//            input = scanner.nextInt();
//
//            switch (input){
//                case 0 : System.err.println("Exiting....");
//                       break;
//                case 1: System.out.print("Enter data to insert: ");
//                       list.insert(scanner.nextInt());
//                       break;
//                case 2: list.print();
//                        break;
//                case 3: System.out.println("Enter position to delete node : ");
//                        list.delete(scanner.nextInt());
//                        break;
//                case 4: list.removeDuplicates();
//                        break;
//                case 5: list.sort();
//                        break;
//                case 6:
//                    System.out.println("===========Enter 1st list details===========");
//                        SingleLinkedList list1 = createList();
//                    System.out.println("===========Enter 2nd list details===========");
//                        SingleLinkedList list2 = createList();
//                        merge(list1,list2);
//                        break;
//                default:System.err.println("Invalid input...!!!\n");
//            }
//        } while(input != 0);
    }
}
