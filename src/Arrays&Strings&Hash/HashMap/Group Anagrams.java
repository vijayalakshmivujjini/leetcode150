class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> hm = new HashMap<>();

        for(String str:strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String ns=new String(c);
            if(!hm.containsKey(ns)){
                hm.put(ns,new  ArrayList<>());
            }
            hm.get(ns).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}