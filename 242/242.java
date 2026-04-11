class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s[i])) {
                letters.put(s[i], letters.get(s[i]) + 1);
            } else {
                letters.put(s[i], 1);
            }
        }

        

    }
}