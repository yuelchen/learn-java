class Solution {
    public String licenseKeyFormatting(String S, int K) {
        
        S = S.replace("-", "");
        
        // The below line is commented out for recusrive solution
        //return getLicenceKeyFormat(S, K).toUpperCase();
        
        // The below line is iterative solution
        StringBuilder sb = new StringBuilder();
        
        int length = S.length();            
        do {
            if(length <= K) {
                sb.insert(0, S.substring(0, length));
            } else {
                int subStart = length - K;
                sb.insert(0, "-".concat(S.substring(subStart, length)));
            }
            
            length -= K;
            
        } while(length > 0);
                          
        return sb.toString().toUpperCase();
    }
    
    /*  Recursive function to retrieve String S based on max delimit size of K
     *  
     *  Assumes that S already has all 'hyphens' removed. 
     */
    private String getLicenceKeyFormat(String S, int K) {
        
        StringBuilder sb = new StringBuilder();
        if(S.length() > K) {
            int subEnd = S.length() - K;
            
            sb.append(getLicenceKeyFormat(S.substring(0, subEnd), K));
            sb.append("-");
            sb.append(S.substring(subEnd));
            
            return sb.toString();
            
        } else {
            return S;
        }
    }
}
