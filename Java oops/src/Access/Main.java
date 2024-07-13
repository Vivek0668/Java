package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(3, "Access");
        System.out.println(obj.getNum());
        int ans =  obj.setNum(5);
        System.out.println(ans);
    }
}
