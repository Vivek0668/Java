import Singly.CustomLinekdlist;

public class Main {

    public static void main(String[] args) {
        CustomLinekdlist list = new CustomLinekdlist();
        list.insertFirst(22);
        list.insertFirst(23);
        list.insertFirst(82);
        list.insertFirst(902);
//        list.insertFirst(289);
//
//        list.insertLast(899);
//
////        list.deleteLast();
//        list.delete(3);
//        list.delete(2);
////        list.deleteFirst();
//
//
//        list.display();
        list.insertRec(33,2);
        list.display();
    }

}