package Circular;

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.insert(33);
        list.insert(34);
//        list.display();
        list.display2();
        list.delete(34);
        list.display2();




    }
}
