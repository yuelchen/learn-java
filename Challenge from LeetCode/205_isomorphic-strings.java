class Solution {
    
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> keyToValue = new HashMap<Character, Character>();
        Map<Character, Character> valueToKey = new HashMap<Character, Character>();
        
        for(int i=0; i<t.length(); i++) {
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);
            
            if(!keyToValue.containsKey(tChar) && !valueToKey.containsKey(sChar)) {
                keyToValue.put(tChar, sChar);
                valueToKey.put(sChar, tChar);
            } else if(!keyToValue.containsKey(tChar) || !valueToKey.containsKey(sChar)) {
                return false;
            } else {
                char existingValue = keyToValue.get(tChar);  
                char existingKey = valueToKey.get(sChar);
                if(Character.compare(existingValue, sChar) != 0 || Character.compare(existingKey, tChar) != 0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
