class Solution {
    public String longestPalindrome(String s) {

        String res="";
        if(s.length()<=1){
            return s;
        }
        for(int i=0;i<s.length();i++){

            String oddlen=expand(s,i,i);
            String evenlen=expand(s,i-1,i);
            if(oddlen.length()>res.length()){
                res=oddlen;
            }
            if(evenlen.length()>res.length()){
                res=evenlen;
            }
        } return res;
    }
    public String expand(String s,int left, int right){
        while(left >= 0 && right < s.length()
                && s.charAt(left)==s.charAt(right)){
            left--;
            right++;


        }return s.substring(left+1,right);
    }

}