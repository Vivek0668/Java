public class Pattern6 {
    public static void main(String[] args) {
         print(6);

    }
    static  void print(int n) {
        for (int i = 1; i < n; i++) {
            int spaces = n-i;
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <=i; j++) {
                System.out.print (j);
                
            }
            System.out.println();
           
        }
    }
    


        

    
}
