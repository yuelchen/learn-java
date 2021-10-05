class Solution {
    public boolean detectCapitalUse(String word) {
    
        if(word.length() == 1) {
            return true;
            
        } else {
            Character first = word.charAt(0);
            Character second = word.charAt(1);
            
            if(first.equals(Character.toUpperCase(first)) 
                && second.equals(Character.toUpperCase(second))) {
                
                return isRemainingUpper(word);
                
            } else if((first.equals(Character.toUpperCase(first)) 
                && !second.equals(Character.toUpperCase(second)))  
                    || first.equals(Character.toLowerCase(first))) {
                    
                return isRemainingLower(word);
                
            } else {
                return false;
            }
        }
    }
    
    private boolean isRemainingUpper(String word) {
        for(int i=1; i<word.length(); i++) {
            Character current = word.charAt(i);
            if(!current.equals(Character.toUpperCase(word.charAt(i)))) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isRemainingLower(String word) {
        for(int i=1; i<word.length(); i++) {
            Character current = word.charAt(i);
            if(!current.equals(Character.toLowerCase(word.charAt(i)))) {
                return false;
            }
        }
        
        return true;
    }
}
