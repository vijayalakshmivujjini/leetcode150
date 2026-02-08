class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pat=new HashMap<>();
        HashMap<String,Character> rev=new HashMap<>();
        String[] stringArray = s.split(" ");
        if (pattern.length() != stringArray.length) return false; // i fogor this edge case

        for(int i=0;i<pattern.length();i++){
            if(pat.containsKey(pattern.charAt(i))){
                if(!pat.get(pattern.charAt(i)).equals(stringArray[i])) //pattern to string
                    return false;
            }else{ //i missed reverse check, string to pattern - example if s = "dog dog" to "ab" // same key not matched to 2 diff keys
                if(rev.containsKey(stringArray[i])){
                    if(!rev.get(stringArray[i]).equals(pattern.charAt(i))) //pattern to string
                        return false;}
                pat.put(pattern.charAt(i),stringArray[i]);
                rev.put(stringArray[i],pattern.charAt(i));

            }

        }
        return true;
    }
}