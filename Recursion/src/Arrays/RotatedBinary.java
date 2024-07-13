package Arrays;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,9,0};
        System.out.println(binary(arr,7,0,arr.length-1));

    }


    static int binary(int[] arr, int target, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end-start) /2;

        if(arr[mid]== target) {
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target >= arr[start] && target<= arr[mid] ) {
                return binary(arr,target,start,mid-1);
            }else {
                return binary(arr,target,mid+1,end);
            }

        }
        if(target>=arr[mid] && target<=arr[end]) {
            return binary(arr,target,mid+1,end);
        }
        return binary(arr,target,start,mid-1);

    }
}
