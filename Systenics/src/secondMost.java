public class secondMost {
    public static void main(String[] args) {
        int[] arr = {6,4,5,2,1};
        System.out.println(seccMost(arr));

    }

    //using two loops
    public static int  secMost(int[] arr) {
        int max =Integer.MIN_VALUE;
        int secondMax =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
            for(int j=0;j<arr.length-1;j++) {
                if( arr[j]!=max &&arr[j]> secondMax) {
                    secondMax = arr[j];
                }
            }



        return secondMax;
    }

    //using one loop
    public static int seccMost(int[] arr) {
        if(arr.length<2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];

            }else if(arr[i]>secondMax && arr[i]<max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
