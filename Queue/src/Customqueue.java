public class Customqueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end =0;

    public Customqueue() {
        this(DEFAULT_SIZE);

    }
    public Customqueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;

    }
    public boolean isEmpty() {
        return end == 0;
//      if(end ==-1) {
//          return true;
//      }
//      return false;
//    }
    }

    public boolean insert(int value) {
        if(isFull()) {
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is already empty");
        }
        int removed = data[0];
        for(int i=1; i<end;i++) {
            data[i-1] = data[i];

        }
        end--;
        return removed;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("Queue is already empty");
        }
        return data[0];

    }
    public void display() {
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i] + " ");

        }
    }


}
