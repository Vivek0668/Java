import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int [] arr =  {
             11,13,5,6,7,9,10,12,4,2,3,1,8

    };
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));



    }
    //cyclic sort using for loop
    static void Cyclic(int arr[]) {
        for(int i=0;i<arr.length;) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            }else {
                i++;
            }
        }
    }
    //cyclic sort using while loop
    static void Cyclic2(int arr[]) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }

    }


}
