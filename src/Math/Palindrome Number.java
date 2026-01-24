class Solution {
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String rev="";
        for(int j=s.length()-1;j>=0;j--){
            rev+=s.charAt(j);
        }
        if(s.equals(rev))
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        int x=121;
        System.out.println(isPalindrome(x));
    }
}