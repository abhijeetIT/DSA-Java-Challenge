package LinkedList.SingleLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class SingleLinkedList {
    Node head;

    public static SingleLinkedList createList(){
        SingleLinkedList list = new SingleLinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length of list: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            System.out.print("Enter data : ");
            list.insert(sc.nextInt());
        }
        list.print();
        System.out.println("==================================");
        return list;
    }
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

    public void sort(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }

        int size=size();

        Node ptr1, ptr2;
        for (int i = 0 ; i < size-1 ; i++){
            ptr1=head;
            ptr2=head.next;
            for (int j=0 ; j < size-i-1 && ptr2 != null; j++) {
                if (ptr1.data > ptr2.data){
                    int temp = ptr1.data;
                    ptr1.data = ptr2.data;
                    ptr2.data = temp;
                }
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        System.out.println("list sorted successfully..!!");
    }

    public static void merge(SingleLinkedList l1, SingleLinkedList l2){

        if (l1.head == null || l2.head == null){
            System.out.println("List is empty.");
            return;
        }

        Node l1Head = l1.head;
        Node l2Head = l2.head;

        SingleLinkedList ans = new SingleLinkedList();
        while(l1Head != null && l2Head != null){
            if (l1Head.data < l2Head.data){
                ans.insert(l1Head.data);
                l1Head = l1Head.next;
            }else{
                ans.insert(l2Head.data);
                l2Head = l2Head.next;
            }
        }

        while(l1Head != null){
            ans.insert(l1Head.data);
            l1Head = l1Head.next;
        }

        while(l2Head != null){
            ans.insert(l2Head.data);
            l2Head = l2Head.next;
        }

        System.out.println("Merged successfully...");
        ans.print();
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();






































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
