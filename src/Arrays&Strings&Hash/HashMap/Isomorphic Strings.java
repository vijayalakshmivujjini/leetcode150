class Solution {/// logic same as word pattern
    public boolean isIsomorphic(String s, String t) {
//   // initially i implenetd with hashset but along with uniquness poision also matters, isomorphic means mapping must match position-by-position,
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // check s -> t mapping
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            // check t -> s mapping (to avoid two chars mapping to same), isomorphic checking has to be 2 way i missed this 2nd check
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}

