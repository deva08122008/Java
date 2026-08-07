class Solution {
    public int scoreOfString(String s) {
        int totalScore=0;
        for(int i=0;i<s.length()-1;i++){
            char current=s.charAt(i);
            char next=s.charAt(i+1);
            int diff=current -next;
            if(diff<0){
                diff=-diff;

            }
            totalScore+=diff;
        }
        return totalScore;
        
    }
}
