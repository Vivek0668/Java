package Pattern;

public class All {
    public static void main(String[] args) {
        print6(5);

    }


    public static void print1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

    public static void print2(int n){
        for(int i=0;i<n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print3(int n) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++){
                int no =j+1;
                System.out.print(no + " ");
            }
            System.out.println();
        }
    }

    public static void print4(int n) {
       for(int i=0;i<2*n;i++) {
           int no= (i>n) ? 2*n-i: i;
           for(int j=0;j<no;j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    public static void  print5(int n)  {
        for(int i=0;i<n;i++) {
            int no0fspaces= n-i;
            for(int k=0;k<no0fspaces;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void print6 (int n ) {
        for(int  i=0;i<2*n;i++) {
            int no = (i>n) ? 2*n-i: i;
            int mid = n;
            int noOfpaces = (i>n) ? mid-no :n-i;
            for(int k=0;k<noOfpaces;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<no;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}

