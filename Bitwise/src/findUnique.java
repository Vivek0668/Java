public class findUnique {
    public static void main(String[] args) {
         int[] arr= {8,0,9,6,9,0,8};
        System.out.println(unique(arr));

    }

    public static int unique(int[] arr) {
        int unique =0;
        for(int n: arr) {
             unique ^=n;
        }
        return unique;
    }   
}
