import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(10);
        stack.push(88);
        stack.push(43);
        stack.push(20);
//        stack.display();
        stack.pop();
//        stack.display();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());


    }
}