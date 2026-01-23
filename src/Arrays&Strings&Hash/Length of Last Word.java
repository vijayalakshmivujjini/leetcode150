class Solution { // Pattern: Reverse Traversal (String scanning from end)
    public int lengthOfLastWord(String s) {
        int len=s.length()-1,res=0;
        for(int i=len;i>=0;i--){
            if(s.charAt(i)!=(' '))
                res++;
            else {
                if (res > 0) break;
            }
        }

        return res ;

    }
}

// Time: O(n), where n = length of the string
// You scan the string once from end to start.
// Space: O(1)