import java.util.Arrays;

public class Passingarr {
    public static void main(String[] args) {
        int[] num = {2,4,67,53};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));


    }

    static void change(int ar[]) {
        ar[3] = 43;

    }
}
