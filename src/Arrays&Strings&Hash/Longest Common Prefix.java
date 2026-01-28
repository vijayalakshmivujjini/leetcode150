class Solution {
    public String longestCommonPrefix(String[] strs) {
        String base=strs[0];
        for(int i=0;i<base.length();i++){ //This solution uses vertical scanning.
            //We compare characters column-wise across all strings and terminate early on mismatch
            for(String s:strs){
                if(i >= s.length() || base.charAt(i)!=s.charAt(i))
                    return base.substring(0, i);
            }
        }

        return base;
    }
}

// For Longest Common Prefix, complexity is:

// Let:

// N = number of strings

// M = length of the shortest string (or prefix length)

// O(N · M)