class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            frequency.put(num, frequency.containsKey(num) ? 2 : 1);
        }

        for(int key : frequency.keySet()){
            if(frequency.get(key) == 1){
                return key;
            }
        }

        return 0;
    }
}