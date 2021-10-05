class Solution {

    Map<Character, Character> pairs = new HashMap<Character, Character>();
    
    private void loadPairs() {
        this.pairs.put('(', ')');
        this.pairs.put('{', '}');
        this.pairs.put('[', ']');
    }
    
    public boolean isValid(String s) {
    
        this.loadPairs();
        
        boolean valid = true;
        Stack<Character> characters = new Stack<Character>();
        
        for (int i=0;i<s.length();i++) {
            if (this.pairs.containsKey(s.charAt(i))){
                characters.push(s.charAt(i));
            } else if (this.pairs.containsValue(s.charAt(i)) && !characters.empty()) {
                Character match = s.charAt(i);
                Character stack = characters.pop();
                if(match != this.pairs.get(stack)) {
                    valid = false;
                    break;
                }
            } else if (this.pairs.containsValue(s.charAt(i)) && characters.empty()) {
                valid = false;
                break;
            }
        }
        
        if (!characters.empty()) {
            valid = false;
        }
        
        return valid;
    }
}
