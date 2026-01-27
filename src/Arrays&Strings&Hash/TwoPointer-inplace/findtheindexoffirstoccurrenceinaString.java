class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length()==0)return 0;
        if(needle.length()>haystack.length()) return -1;
        //for(int i=0;i<haystack.length();i++){
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && needle.charAt(j)==haystack.charAt(i+j)){ //use while loop insted of if and as we are adding i+j here in for loop i<haystack.length() will fail with indexoutofbounds so we are replacing
                j++;
            }
            if(j==needle.length())return i;
        }
        return -1;
    }
}