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

    public

    public static void main(String[] args) {
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
