package NQueens;

public class Main {
    public static void main(String[] args) {
//        int[][] example =  {
//                {1,2,3},
//                {2,3,4,6},
//                {4,5,6},
//        };
//        for (int i = 0; i < example.length; i++) {
//            for (int j =0;j<example[i].length; j++) {
//                System.out.println(example[i][j]);
//
//
//            }
//            System.out.println();
//
//        }

        int[][] ex2 = {
                {2,3,4},
                {3,4,6,0},
                {2,6,2}
        };

        for(int[] arr : ex2) {
            for(int num: arr) {
                System.out.println(num);
            }
            System.out.println();
        }

    }



}
