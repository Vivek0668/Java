package DUplicates;
import  java.util.Arrays;
public class dupli {

    public static void main(String[] args) {
        int[] arr = {3,5,6,3,2,7,7};
//        System.out.println(isDupli(arr));
        System.out.println(Arrays.toString(isddupli(arr)));

    }
    //to return true or false if the arr contains duplicates

    public static boolean isdupli(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]== arr[i+1]) {
                return true;
            }
        }
        return  false;
    }

    // to return duplicates
    public static int isDupli(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]== arr[i+1]) {
                return i;
            }
        }
        return -1;
    }

    //to return mutiple duplicates
    public static int[] isddupli(int[] arr) {
        Arrays.sort(arr);
        int[] nums = new int[ arr.length];
        int index =0;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]== arr[i+1]) {
                nums[index] = arr[i];
                index++;


            }
        }
        return nums;

    }


}
