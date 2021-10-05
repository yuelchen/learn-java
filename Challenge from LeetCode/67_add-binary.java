class Solution {
    public String addBinary(String a, String b) {
    
        // int aVal = Integer.parseInt(a, 2); 
        // int bVal = Integer.parseInt(b, 2);
        // return Integer.toString(aVal+bVal, 2);
        
        // Above solution has integer limit when converting large inputs:
        // "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        // "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        
        String[] large = a.length() >= b.length() ? a.split("", -1) : b.split("", -1);
        String[] small = a.length() < b.length() ? a.split("", -1) : b.split("", -1);
        
        String solution = "";
        int carryOver = 0;
        int counter = 2;
        
        do {
            String lVal = getBinary(counter, large);
            String sVal = getBinary(counter, small);
            
            int result = getAddResult(lVal, sVal, carryOver);
            if(result == 0) {
                carryOver = 0;
                solution = "0" + solution;
            } else if(result == 1) {
                carryOver = 0;
                solution = "1" + solution;
            } else if(result == 2) { 
                carryOver = 1;
                solution = "0" + solution;
            } else {
                carryOver = 1;
                solution = "1" + solution;
            }
            
            counter++;
            
        } while(counter <= large.length);
        
        if(carryOver == 1) {
            solution = "1" + solution;
        }
        
        return solution;
        
    }
    
    private int getAddResult(String largeValue, String smallValue, int carryOver) {
        int count = 0;
        if((largeValue.equals("1") && smallValue.equals("0")) || 
                  (largeValue.equals("0") && smallValue.equals("1"))){
            count = 1;
        } else if(largeValue.equals("1") && smallValue.equals("1")) {
            count = 2;
        }
        
        if(carryOver == 1) {
            count++;
        }
        
        System.out.println(largeValue + " + " + smallValue + " + " + carryOver + " = " + count);
        return count;
    }
    
    private String getBinary(int counter, String[] array) {
        int arrayIndex = array.length - counter;
        return arrayIndex >= 0 ? array[arrayIndex] : "0";
    }
}
