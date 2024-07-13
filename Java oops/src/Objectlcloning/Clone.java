package Objectlcloning;

public class Clone implements  Cloneable {
    int age;
    String name;
    String job;
    int arr[];

    Clone(){

    }

    Clone(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
        this.arr = new int[] {3,5,7,4,100};
    }
    Clone(Clone other) {
        this.age = other.age;
        this.name = other.name;
        this.job = other.job;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepclone() {
        Clone clone = new Clone();

        clone.name = this.name;
        clone.job = this.job;
        clone.arr =  new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            clone.arr[i] = this.arr[i];

        }


        return  clone;

    }
}
