class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        
        int romanInteger = 0;
        for (int i=0;i<s.length();i++) {
            int currentIndexValue = romanNumerals.get(s.charAt(i));
            if (i+1 < s.length()) {
                int nextIndexValue = romanNumerals.get(s.charAt(i+1));
                if (currentIndexValue < nextIndexValue) {
                    int difference = nextIndexValue - currentIndexValue;
                    romanInteger += difference;
                    i++;
                } else {
                    romanInteger += currentIndexValue;
                }
            } else
                romanInteger += currentIndexValue;
            }
        }
                
        return romanInteger;
    }
}
