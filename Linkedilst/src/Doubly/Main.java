package Doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(33);
        list.insertFirst(45);
        list.insertFirst(789);
        list.insertFirst(19);
//        list.display2();
        System.out.println();

//        list.display();
        list.insertLast(44);
//        list.display();
        list.insertAfter(789,69);
        list.display();
        System.out.println();
        list.display(3);


    }

}
