class Solution {
    public int isWinner(int[] player1, int[] player2) {
        boolean strikeInPrev2 = false;
        int player1score = 0;
        int player2score = 0;
        
        int lastStrike = 0;
        for(int i = 0; i < player1.length; i++){
            if(lastStrike > 2){
                strikeInPrev2 = false;
            }
            if(strikeInPrev2 == true){
                player1score += player1[i] * 2;
            }
            else{
                player1score += player1[i];
            }
            if(player1[i] == 10){
                lastStrike = 0;
                strikeInPrev2 = true;
            }
            lastStrike++;
        }
        System.out.println(player1score);
        
        strikeInPrev2 = false;
        lastStrike = 0;
        
        for(int i = 0; i < player2.length; i++){
            if(lastStrike > 2){
                strikeInPrev2 = false;
            }
            if(strikeInPrev2 == true){
                player2score += player2[i] * 2;
            }
            else{
                player2score += player2[i];
            }
            if(player2[i] == 10){
                lastStrike = 0;
                strikeInPrev2 = true;
            }
            lastStrike++;
        }
        System.out.println(player2score);

        if(player2score > player1score){
            return 2;
        }
        else if(player2score < player1score){
            return 1;
        }
        else{
            return 0;
        }
          
    }
}