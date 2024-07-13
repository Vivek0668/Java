package Arrays;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,2,6};
        System.out.println(getindex(arr,6,0));

    }

    static boolean check (int[] arr, int target,int index) {
        if(index == arr.length) {
            return false;
        }
      return  arr[index]== target || check(arr,target,index+1);
    }

    static boolean revcheck (int[] arr, int target,int index) {
        if(index == -1) {
            return false;
        }
        return  arr[index]== target || check(arr,target,index-1);
    }

    static int getindex(int[] arr, int target , int index) {
        if(index== arr.length){
            return -1;
        }

        if( arr[index]== target ){
            return index;
        }

         return getindex(arr,target,index+1);





    }
}
