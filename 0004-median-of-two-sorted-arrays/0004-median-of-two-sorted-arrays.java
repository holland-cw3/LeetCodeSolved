class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int index = 0;

        for(int i : nums1){
            nums3[index] = i;
            index++;
        }
        for(int i : nums2){
            nums3[index] = i;
            index++;
        }
        Arrays.sort(nums3);
        if(nums3.length % 2 == 0){
            return (double) (nums3[nums3.length / 2] + nums3[nums3.length / 2 - 1]) / 2;
        }
        else{
            return (double) nums3[nums3.length / 2];
        }
    }
}