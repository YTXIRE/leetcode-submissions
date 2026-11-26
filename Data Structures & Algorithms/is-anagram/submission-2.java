class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();

        if (s.length() != t.length()) {
            return  false;
        }

        for (char c : s.toLowerCase().toCharArray()) {
            if (word1.containsKey(c)) {
                word1.put(c, word1.get(c) + 1);
            } else {
                word1.put(c, 1);
            }
        }

        for (char c : t.toLowerCase().toCharArray()) {
            if (word2.containsKey(c)) {
                word2.put(c, word2.get(c) + 1);
            } else  {
                word2.put(c, 1);
            }
        }

        for (char c : word1.keySet()) {
            if (!word2.containsKey(c) || !Objects.equals(word1.get(c), word2.get(c))) {
                return false;
            }
        }
        return true;
    }
}
