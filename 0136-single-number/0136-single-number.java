class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();

        for(int num : nums){
            if(unique.contains(num)){
                unique.remove(num);
            }
            else{
                unique.add(num);
            }
        }
        return unique.iterator().next();

    }
}