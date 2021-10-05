class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> charToCount = getCharCount(s);
        
        for(int i=0; i<t.length(); i++) {
            Character character = new Character(t.charAt(i));
            if(charToCount.containsKey(character)) {
                if(charToCount.get(character) > 1) {
                    charToCount.put(character, charToCount.get(character) - 1);
                } else {
                    charToCount.remove(character);
                }
            } else {
                return false;
            }
        }
        
        return charToCount.size() == 0;
    }
    
    private Map<Character, Integer> getCharCount(String s) {
        
        Map<Character, Integer> charToCount = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            Character character = new Character(s.charAt(i));
            if(charToCount.containsKey(character)) {
                charToCount.put(character, charToCount.get(character) + 1);
            } else {
                charToCount.put(character, 1);
            }
        }
        
        return charToCount;
    }
}
