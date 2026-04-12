class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedLetters = new String(letters);

            if (!anagrams.containsKey(sortedLetters)) {
                anagrams.put(sortedLetters, new ArrayList<>());
            }

            anagrams.get(sortedLetters).add(strs[i]);
        }

        return new ArrayList<>(anagrams.values());

    }
}