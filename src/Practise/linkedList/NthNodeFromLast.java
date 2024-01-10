package Practise.linkedList;

class ClassA {

    public ClassA() {
        System.out.println("Inside A");
    }

    long m1() {
        System.out.println("Inside m1 of A");
        return 10;
    }

}

class ClassB extends ClassA {

    public ClassB() {

        System.out.println("Inside B");

    }

    @Override
     protected long m1() {
        System.out.println("Inside m1 of B");
        return 20;
    }



}


public class NthNodeFromLast {

    public static void main(String args[]) {

//        Node

        int[] arr= {1,2,3,4,5};
        Node head = LinkedList.insertAll(arr);

        LinkedList.displayList();
        ClassB classB = new ClassB();
        classB.m1();
//        Class1.m1();
//        System.out.println("THe lement is :: "+nthNode(head, 1));


    }

//    public static int nthNode(Node head, int count) {
//
//        if(head == null) {
//            return 0;
//        }
////        return nthNode(head.next, )
//
//    }


}
