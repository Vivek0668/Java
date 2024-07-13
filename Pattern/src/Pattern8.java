import java.util.Arrays;

public class Pattern8 {
    public static void main(String[] args) {

        int[] arr = {2,3,4,32,2};

//        bubble(arr,4,0);
        System.out.println(Arrays.toString(arr));


    }

    static void print(int row, int col) {
        if(row==0) {
            return;
        }
        if(row>col) {
            System.out.print("* ");
            print(row, col+1);
        }else {
            System.out.println();
            print(row-1,0);

        }


    }
    static void print2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {

            print(row, col + 1);
            System.out.print("* ");
        } else {

            print(row - 1, 0);
            System.out.println();

        }
    }



    }

