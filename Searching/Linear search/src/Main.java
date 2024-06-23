import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array elements : ");
        int [] array = new int[6];
      for(int i=0;i<array.length;i++) {
          array[i] = input.nextInt();
      }
        System.out.print("Enter the target element you want to search : "  +" ");
      int target = input.nextInt();
        System.out.print(Linear(array,target));



    }

    static int Linear(int[] arr, int target) {
        if(arr.length==0) {
            return -1;
        }

        for(int i=0;i<arr.length;i++) {
            int element = arr[i];
            if(element == target) {
                System.out.print("Target found at index " + i);
                System.out.println();
                return i;



            }


        }
        return -1;

    }
}