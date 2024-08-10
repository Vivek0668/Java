package Singly;

public class CustomLinekdlist {

     public Node head;
     public Node tail;

     private int size;


     public CustomLinekdlist () {
         this.size = 0;

     }




     public CustomLinekdlist(int size) {
         this.size = size;
     }
     public void insert(int value, int index) {
         if(index == 0) {
             insertFirst(value);
             return;
         }
         if(index == size) {
             insertLast(value);
             return;
         }
         Node temp = head;
         for (int i = 1; i < index; i++) {
             temp = temp.next;
    }
         Node  node = new Node(value, temp.next);
         temp.next =node;
         size++;
     }

     public void insertFirst(int value) {
         Node node = new Node(value);
         node.next = head;
         head = node;

         if(tail==null) {
             tail =head;
         }
         size +=1;

     }

     //improvised version of deleteFirst
     public  int deleteFirst(){
         int value = head.value;
         head = head.next;
         if(head == null) {
             tail = null;
         }
         size --;
         System.out.println("Value removed is :" + value);
         return value;



     }

     //simple delete
//    public void deleteFirst()  {
//         head = head.next;
//         size--;
//    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;  // Update the size after deletion
        System.out.println("Value removed is :" + val);
        return val;
    }



    public int delete(int index) {
         if(index == 0) {
             return deleteFirst();
         }
         if(index == size-1) {
             return deleteLast();
         }
         Node prev = get(index-1);
         int val = prev.next.value;
         prev.next = prev.next.next;

         return val;
    }

//    public void insertRecurrsion(int val, int index) {
//         head = insertRec(val,index,head);
//    }
//    private Node insertRec (int val, int index, Node node) {
//         if(index==0) {
//             Node temp = new Node(val,node);
//             size++;
//             return temp;
//         }
//         node.next = insertRec(val,index--,node.next);
//         return node;
//    }
    // insert using recursion
//    public void insertRec(int val, int index) {
//
//        head = insertRec(val, index, head);
//    }
//
//    private Node insertRec(int val, int index, Node node) {
//        if (index == 0) {
//            Node temp = new Node(val, node);
//            size++;
//            return temp;
//        }
//        node.next = insertRec(val, --index, node.next);
//        return node;
//    }
    public void insertRec(int val, int index) {
         head = insertRecurrsion(val,index, head);

    }
    public Node insertRecurrsion(int val, int index, Node node){
         if(index==0) {
             Node temp = new Node(val,node);
             size++;
             return temp;
         }

         node.next = insertRecurrsion(val,--index,node.next);
         return node;
    }


     public void insertLast (int value) {
           Node last = new Node(value);
           tail.next = last;
           tail = last;
           size++;
     }

    public void display() {
         Node temp = head;
         while(temp!=null) {
             System.out.print(temp.value + "-> ");
             temp = temp.next;

         }
         System.out.println("End");
     }

    public class Node{
       public int value;
       public Node next;

        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next)  {
            this.value = value;
            this.next = next;
        }

    }





}
