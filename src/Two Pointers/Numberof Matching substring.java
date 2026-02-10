class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<String, Integer> map = new HashMap<>(); //instead of using string directly using hashmap will      resolve tle issue as it handles larger i/p
        for (String w : words)
        {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        for(String w:map.keySet()){
            int left=0,right=0;
            while(left<s.length() && right<w.length()){
                if(s.charAt(left)==w.charAt(right)){
                    left++;
                    right++;
                }else{
                    left++;
                }
            }
            if(right==w.length())
                count+=map.get(w);

        }

        return count;
    }
}