class Solution {
    public String convertToTitle(int n) {
        
        String columnName = "";
        
        if(n <= 26) {
            columnName += getLetterAtIndex(n - 1);
        } else if(n > 26 && n % 26 == 0) {
            n = (n / 26) - 1;
            columnName = convertToTitle(n) + getLetterAtIndex(25);
        } else if(n > 26 && n % 26 > 0) {
            int remainder = n % 26;
            n = (n / 26);
            columnName = convertToTitle(n) + getLetterAtIndex(remainder - 1);
        }
        
        return columnName;
    }
    
    private char getLetterAtIndex(int index) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alphabet.charAt(index);
    }
}
