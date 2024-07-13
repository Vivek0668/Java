public class Pattern7 {
    public static void main(String[] args) {
        print(5);

    }
    static void print(int n) {
        for (int i = 1; i <2*n; i++) {


            int spaces = i>n ? i-n : n-i;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            

        }

    }
}
