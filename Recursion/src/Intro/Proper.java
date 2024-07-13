package Intro;
//proper example of recursion
//simple example

public class Proper {
    public static void main(String[] args) {
        print(1);
    }
    static void print (int n) {

        if(n == 7) {
            return;

        }

        System.out.println(n);

        print(n + 1);
    }
}
