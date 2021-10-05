class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        } else {
            String value = countAndSay(n-1);
            
            String output = "";
            char character = value.charAt(0);
            int count = 1;
            
            for(int i=1; i<value.length(); i++) {
                if(character == value.charAt(i)) {
                    count++;
                } else {
                    output += Integer.toString(count) + character;
                    character = value.charAt(i);
                    count = 1;
                }
            }
            
            output += Integer.toString(count) + character;
            return output;
        }
    }
}
