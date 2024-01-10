package Practise.linkedList;



//test case


//[2,5,23] [1,4,6] [3, 10, 7]

// [1,2,3,4,5,6,7,10,23  Arrays.sort(finalArr);
class Node1 {

    int data;
    Node1 next;

//    Node1() {
//        this.next = null;
//
//    }

}

class LinkedList1 {

    public Node1 sortLinkedList(Node1 root1, Node1 root2) {
        if(root1 == null && root2 == null) {
            return null;
        }
        return null;

    }

    public Node1 insertAllNodes(int arr[]) {
        Node1 root = null;
        if(arr.length == 0) {
            return root;
        }

        root = new Node1();
        root.data = arr[0];
        root.next = null;

        int startIndex = 1;
        Node1 currentNode = root;
        while(startIndex<arr.length) {

            Node1 newNode = new Node1();
            newNode.data = arr[startIndex];
            newNode.next = null;
            currentNode.next = newNode;
            currentNode = newNode;
            startIndex++;
        }

        return root;
    }

}

public class SortingLinkedList {

    public static void main(String args[]) {

        LinkedList1 linkedList1 = new LinkedList1();
        int[] arr1 = {2,5,23};
        Node1 root1 = linkedList1.insertAllNodes(arr1);
        System.out.println(root1);

        LinkedList1 linkedList2 = new LinkedList1();
        int[] arr2 = {1, 4, 6};
        Node1 root2 = linkedList1.insertAllNodes(arr2);
        System.out.println(root2);

        LinkedList1 linkedList3 = new LinkedList1();
        int[] arr3 = {3, 10, 7};
        Node1 root3 = linkedList1.insertAllNodes(arr3);
        System.out.println(root3);



    }

}
