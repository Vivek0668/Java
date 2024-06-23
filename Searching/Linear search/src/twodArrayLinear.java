import java.util.Scanner;

public class twodArrayLinear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want in the array : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns you want in the array : ");
        int col = sc.nextInt();
        int [][] arr = new int[rows][col];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element you want to search : ");
        int target = sc.nextInt();
        Linear(arr,target);



    }

    static int Linear (int[][] arr,int target) {
        if(arr.length ==0) {
            System.out.print("Enter valid number of aray elements");
            return -1;
        }
        for(int row =0; row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                int element = arr[row][col];
                if(element== target) {
                    System.out.println("Element exists at postion in column " + col + " of row " + row);
                    return 1;
                }
            }
        }
        System.out.println("Element not found");
        return -1;

    }
}
