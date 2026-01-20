class Solution {
    public int countSubstrings(String s) {

        int res=0;
        if(s.length()<=1)
            return 1;
        for(int i=0;i<s.length();i++){
            res+=expand(s,i,i);
            res+=expand(s,i-1,i);

        }
        return res;
    }

    int expand(String s, int left,int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }return count;

    }
}