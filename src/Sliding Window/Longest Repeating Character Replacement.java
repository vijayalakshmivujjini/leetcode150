class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxwindow = 0, left=0, maxfreq = 0;
        int[] freq=new int[26];// as 26 alphabets

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            int window=right-left+1;
            if(window-maxfreq>k){ //if window-maxfreq > no of operations hen shrink window
                freq[s.charAt(left)-'A']--;
                left++;
            }
            window=right-left+1;
            maxwindow=Math.max(maxwindow,window);
        }
        return maxwindow;
    }
}
