class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int num : nums){
            int frequ = frequency.containsKey(num) ? frequency.get(num) + 1 : 1;
            frequency.put(num, frequ);
        }

        for(int key : frequency.keySet()){
            if(frequency.get(key) == 1){
                return key;
            }
        }

        return 0;
    }
}