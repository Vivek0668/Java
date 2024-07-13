package Generics;

import java.util.Arrays;

public class CustomArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0 ;

    public CustomArraylist () {
        this.data = new Object[DEFAULT_SIZE];
    }


    public void add(T num) {
        if(isfull()) {
            resize();
        }
        data[size++] = num;

    }
    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
        data= temp;


    }
private boolean isfull () {
        if(size== data.length){
            return true;
        }
        return false;

}

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T remove() {
        T remove = (T)(data[--size]);
        return remove;
}
    public T get(int index) {
       
        return  (T)(data[index]);


    }
    public void set(T value, int index){
        data[index] = value;

    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(3);
        list.add(4);
        list.add(55);
        list.add("feifie");

        System.out.println(list);


    }


}
