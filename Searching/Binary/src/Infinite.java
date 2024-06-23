public class Infinite {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6,8,9,12,14,15,16,17,18};
        int target = 16;
        System.out.print(linear(arr,target));

    }

   static int linear(int [] arr,int target) {
        int start =0;
        int end =1;


        while(start<=end) {
       if(target>arr[end]){
        int temp = end+1;
         end =end + (end-start +1) *2;
         start = temp;
       }
            int mid = start + (end-start)/2;
            if(arr[mid]== target) {
                return mid;
            }else if(arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
   }
}
