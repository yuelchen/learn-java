class Solution {
    public int titleToNumber(String s) {
        
        int index = 1;
        int columnNumber = 0;
        
        while(s.length() > 0) {
            char lastChar = s.charAt(s.length() - 1);
            columnNumber += getValueForLetter(lastChar, index);
            
            s = s.substring(0, s.length() - 1);
            index *= 26;
        }
        
        return columnNumber;
    }
    
    private int getValueForLetter(char c, int index) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return (alphabet.indexOf(c) + 1) * index;
    }
}
