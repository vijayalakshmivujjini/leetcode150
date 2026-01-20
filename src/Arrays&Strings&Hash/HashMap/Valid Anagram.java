class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m=new HashMap<>();
        HashMap<Character,Integer> n=new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (n.containsKey(c)) {
                n.put(c, n.get(c) + 1);
            } else {
                n.put(c, 1);
            }
        }
        if(m.equals(n))
            return true;
        else return false;
    }
}