public class CustomStack {
    private static int Default_size = 10;
    protected int[] data;
    private int ptr = -1;

    public CustomStack() {
        this(Default_size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }
//    public void pop(int value) {
//        if(isEmpty()) {
//            return ;
//        }
//        for(int i=0;i<data.length;i++) {
//            if(value!= data[i]) {
//                data[i] = value;
//            }
//        }
//    }
    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Unable to use pop in an Empty stack");

        }
        return data[ptr--];
    }
    public int peak()  throws StackException{
        if(isEmpty()) {
            throw new StackException("Cannot peak in an empty stack");
        }
       return data[ptr];
    }

    public void display () {
        for (int i = 0; i <=ptr; i++) {
            System.out.println(data[i]);

        }
    }

    public boolean isFull() {
        if (ptr == data.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (ptr == -1) {
            return true;

        }
        return false;

    }
}
