class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int pos1 = 0; pos1 < nums.length; pos1++){
            for(int pos2 = pos1 + 1; pos2 < nums.length; pos2++ ){
                if(nums[pos1] + nums[pos2] == target){
                    result[0] = pos1;
                    result[1] = pos2;
                    break;
                }
            }
        }
        return result;
    }
}