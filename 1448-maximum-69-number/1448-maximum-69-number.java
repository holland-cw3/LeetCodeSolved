class Solution {
    public int maximum69Number (int num) {
        StringBuilder number = new StringBuilder(Integer.toString(num));
        for(int i = 0; i < number.length(); i++){
            if (number.charAt(i) == '6'){
                number.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(number.toString());
    }
}