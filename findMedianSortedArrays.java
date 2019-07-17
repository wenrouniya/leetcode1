class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int lp=0;
        int rp=0;
        int p=0;
        int [] result =new int [nums1.length+nums2.length];
        
        
        while(lp<nums1.length&&rp<nums2.length)
        {
            result[p++]=nums1[lp]<nums2[rp]?nums1[lp++]:nums2[rp++];
        }
        
        while(lp<nums1.length){
            result[p++]=nums1[lp++];
        }
        while(rp<nums2.length){
            result[p++]=nums2[rp++];
        }
        
        int count=result.length;
        
        
         if (count % 2 == 0) {
                return (result[count / 2 - 1] + result[count / 2]) / 2.0;
         } else {
              return result[count / 2];
         }
    

    }
}