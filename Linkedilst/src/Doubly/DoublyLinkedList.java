package Doubly;

public class DoublyLinkedList {


    Node head;
    Node tail;
    int size;
    DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!= null) {
            head.prev = node;

        }
        head = node;
        size++;
    }
    public void display() {
        Node node = head ;
        Node last = null;
       while(node != null) {
           last = node;
           System.out.print(node.val+ "->");
           node  = node.next;
       }
        System.out.print("End");
        System.out.println();

       while(last!=null) {

           System.out.print( last.val + "<-");

           last = last.prev;
       }
        System.out.print("Start");



    }
// display approach2 using for loop
//    public void display2 () {
//
//        for (Node temp = head; temp != null; ) {
//            System.out.print(temp.val + "->");
//            temp = temp.next;
//
//        }
//    }

    public void displayRev() {
        Node node =  tail;
        while(node != null) {
            System.out.println(node.val + "<-");
            node = node.prev;
        }
        System.out.print("End");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void insertAfter(int value) {
        Node node = new Node(value, get(value));
        



        }
    public Node get(int value) {
        Node node = head;
        while(node != null) {
            if(node.val== value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int val) {
        Node p = get(after);
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null) {
            node.next.prev = node;
        }

    }

    public void display(int index) {
        if(index<0 || index >=size) {
            System.out.println("Index out of bounds");
            return;
        }
      Node node = head;
        for (int i = 1; i <=index; i++) {
            node= node.next;

        }
        System.out.println(node.val);

    }




      class  Node {
        int val;
        Node next;
        Node prev;

      public Node(int val) {
            this.val = val;

        }
      public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

      public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }





    }

}
