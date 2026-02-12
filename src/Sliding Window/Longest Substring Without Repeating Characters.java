
class Solution {
    public int lengthOfLongestSubstring(String s) { //2 pointer
        int res=0; int left=0;
        HashSet<Character> c=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(c.contains(s.charAt(right))){
                c.remove(s.charAt(left)); //needed to shrink the window from the left and eliminate the duplicate.
                // Although it uses two pointers, the core idea is expanding/shrinking a window dynamically based on a condition → that’s sliding window. Two pointers is a helper concept inside it.
                left++;

            }
            c.add(s.charAt(right));
            if(c.size()>res)
                res=c.size();
        }
        return res;
    }
}