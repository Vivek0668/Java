import java.util.Scanner;

public class Minlinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the aray elements : ");
        int [] arr = new  int [5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(min(arr));


    }

    static int min(int [] arr) {
        int minValue = arr[0];
        if(arr.length==0) {
            return -1;
        }
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<minValue){
                minValue = arr[i];
                return minValue;
            }


        }
        return minValue;

    }





}
