class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int n = (nums1.length<nums2.length) ? nums1.length : nums2.length;
        // int[] arr = new int[n];
        // for(int i =0;i<nums1.length;i++) {
        //     for(int j =0;j<nums2.length;j++) {
        //         if(arr.length<n && arr[i]!=  nums2[j] && nums1[i] == nums2[j])
        //         arr[i] = nums1[i];


        //     }
        // }
        // return arr;

        int[] count = new int[1001];
        int n = (nums1.length>nums2.length) ? nums1.length : nums2.length;

        int j=0;
        int countinter = 0;
        for(int num : nums1) {
            count[num] =1;
        }
        for(int num : nums2) {
            if(count[num] ==1){
                count[num] =2;
                countinter++;
            }

        }
        int[] arr = new int [countinter];
        for(int i=0;i<count.length;i++) {
            if(count[i]==2) {
                arr[j] = i;
                j++;
            }

        }
        return arr;
    }
}