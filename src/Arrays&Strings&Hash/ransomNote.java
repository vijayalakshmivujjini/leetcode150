class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> h=new HashMap<>();
        char[] c=magazine.toCharArray();
        char[] ch=ransomNote.toCharArray();
        int count=0;
        for(int i=0;i<magazine.length();i++){
            h.put(c[i],h.getOrDefault(c[i],0)+1); //i missed this logic- add frequency as value
        }
        for(int j=0;j<ransomNote.length();j++){
            if(h.getOrDefault(ch[j],0)==0){
                return false;
            }else{
                h.put(ch[j],h.get(ch[j])-1); // after every iteration remove element from map
            }

        }   return true;
    }
}