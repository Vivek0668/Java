import Singly.CustomLinekdlist;
import org.w3c.dom.Node;

public class Reverse {
    public static void main(String[] args) {
        CustomLinekdlist list = new CustomLinekdlist();
        list.insertFirst(22);
        list.insertFirst(132);
        list.insertFirst(202);
        list.insertFirst(29);
        list.insertFirst(28);
        list.insertFirst(02);
        reverse(list.head,list);



    }
    static  void  reverse(CustomLinekdlist.Node node, CustomLinekdlist list) {

        if(list.head == list.tail) {
            list.head = list.tail;
            return;
        }
        reverse(node.next, list);
        list.tail.next = node;
        list.tail = node;
        list.tail.next = null;



    }


}
