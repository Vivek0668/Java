package Access;

public class A {

    private int num;
    String name;
    int[] arr;

    A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }
    public int getNum() {
        return this.num;
    }
    public int setNum(int num) {
        return this.num = num;
    }


}
