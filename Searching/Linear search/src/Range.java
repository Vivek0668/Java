import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        int [] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the range to start from : ");
        int index1 = sc.nextInt();
        System.out.print("Enter the range to end with : ");
        int index2 = sc.nextInt();
        System.out.print("Enter the element to find : ");
        int target = sc.nextInt();
        System.out.println(linear(array,index1,index2, target));

    }

    static int linear(int[] array, int index1, int index2, int target) {
        if(array.length == 0) {
            return -1;
        }


        for(int i = index1;i<=index2; i++) {
            int element = array[i];
            if(element == target) {
                return 1;
            }


        }
        return -1;

    }
}
