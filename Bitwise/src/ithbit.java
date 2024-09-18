public class ithbit {
    public static void main(String[] args) {
        System.out.println(set(44,2));

    }

    public static  int set(int ele,int n) {
       int i = 1<<(n-1);
       return ele|i;
        
    }
}
