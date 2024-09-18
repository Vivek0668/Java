public class CustomCircularqueue {
    private int[] data ;
    private static final int DEFAULT_SIZE = 10;

    int end =0;
    int front =0;
    int size =0;

    public CustomCircularqueue() {
        this(DEFAULT_SIZE);

    }
    public CustomCircularqueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull() {
        if(size == data.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(size==0) {
            return true;
        }
        return false;
    }

    public boolean insert(int val) {
        if(isFull()) {
            System.out.println("Queue is already full");
            return false;
        }
        data[end++] = val;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is already empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
       int i = front;
        do{
            System.out.print(data[i]+" ->");
            i++;
            i%= data.length;

        }while (i!= end);
        System.out.println("End");
    }

}
