// String of alphabets we can try new int[26] frequency pattern
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0)
                return false;
        }return true;
// HashMap<Character,Integer> m=new HashMap<>();
// HashMap<Character,Integer> n=new HashMap<>();

//  for (int i = 0; i < s.length(); i++) {
//             if (m.containsKey(s.charAt(i))) {
//                 m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
//             } else {
//                 m.put(s.charAt(i), 1);
//             }
//         }

// for (int i = 0; i < t.length(); i++) {
//             char c = t.charAt(i);
//             if (n.containsKey(c)) {
//                 n.put(c, n.get(c) + 1);
//             } else {
//                 n.put(c, 1);
//             }
//         }
// if(m.equals(n))
// return true;
// else return false;
    }
}