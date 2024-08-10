package Circular;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    int size;


    CircularLinkedList() {
        head = null;
        tail= null;
        size=0;
    }
    CircularLinkedList(int size) {
        this.size =size;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
     public void display () {
         Node node = head;

         if (node == null) {
             System.out.println("nothing to show");
             return;
         } else {
             for (int i = 0; i < size; i++) {
                 System.out.print(node.val + "->");
                 node = node.next;

             }

         }
     }

        public void display2() {
            Node node = head;
            if(head != null) {
                do {
                    System.out.print(node.val + " -> ");
                    node = node.next;
                }while(node!= head);
                System.out.println("head");
            }
         }

       public void delete (int value) {
        Node node = head;
        if(node== null) {
            return;
        }
        if(node.val == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == value) {
                node.next = n.next;
                break;

            }
            node = node.next;
        }while(node!=head);
       }
         public Node get(int value) {
         Node node = head;
         while(node!= null) {
              if(node.val == value) {
                  return node;
              }
              node = node.next;
          }
         return node;
     }




    public class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;

        }
        Node(int val,Node next, Node prev ) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }


}
