class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        
        int threshold = arr.length / 4;
        int result = arr[0];
        int count = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == result) {
                count++;
            } else {
                count = 1;
                result = arr[i];
            }
            if (count > threshold) {
                return result;
            }
        }
        
        return -1;
    }
}
