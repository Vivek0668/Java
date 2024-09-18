public class SumOFmatrices {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {28,29,30},
                {3,869,90},
                {88,67,44}
        };

        int[][] matrix2 = {
                {68,99,33},
                {0,78,583},
                {830,12,83}
        };

        int [] [] ans = sumOfmatrix(matrix1, matrix2);
       display(ans);


    }

    public static int[][] sumOfmatrix(int[][] matrix1, int[][] matrix2) {
        int [][] ans = new int[matrix1.length][matrix2[0].length];
       for(int i=0;i<matrix1.length;i++) {
           for(int j=0;j<matrix2.length;j++) {
               ans[i][j] = matrix1[i][j] + matrix2[i][j];

           }
       }
       return ans;
    }

    public static void display (int[][] matrix) {
        for(int arr[] : matrix) {
            for(int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
