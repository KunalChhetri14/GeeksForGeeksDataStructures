package Practise.linkedList;

class Node {

    int data;
    Node next;
}
class LinkedList {
//    int data;
//    next next;

    static Node root = null;

    public static Node reversenextv1() {

        Node prev = null;
        Node current = root;
        Node next = null;

        while(current != null) {
            next = current.next; //3 //4  //null
            current.next= prev; //null //1  //3
            prev = current; // set to current i.e 1  //3 //4
            current = next; //3 //4 //null
        }
        root = prev;
        return root;
    }

    public static Node insertAll(int[] value) {
        if(value.length == 0) {
            return root;
        }

        if(root == null) {
            root = newNode(value[0]);
        }

        int i= 1;
        Node temp = getLastnext();
        while(i<value.length) {
            Node currentnext = newNode(value[i]);
            temp.next = currentnext;
            temp = currentnext;
            i++;
        }
        return root;
    }

    public static Node getLastnext() {
        Node temp = root;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }


    public static Node reversenext() {

        Node prev = root;
        Node temp = root;


        while(temp.next != null) {
            if(temp == root) {
                prev = temp;
                temp=temp.next;
                prev.next=null;
            } else {
                Node nextnext = temp.next;
                temp.next = prev;
                prev = temp;
                temp = nextnext;
            }
//            temp = temp.next;
        }
        temp.next = prev;
        root = temp;
        return root;
    }

    public static void displayList() {
        Node temp = root;
        System.out.println("New Line");
        while(temp != null) {
            System.out.print(temp.data +  "  ");
            temp = temp.next;
        }
    }


    public static Node newNode(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        return newNode;
    }
}

public class ReverseLinkedList {

    public static void main(String args[]) {

//        LinkedList linkedList = new LinkedList();
        int[] arr1 = {1,3,4,5,6};
        Node rootnext = LinkedList.insertAll(arr1);
        LinkedList.displayList();
        LinkedList.reversenextv1();
        LinkedList.displayList();


    }

}
