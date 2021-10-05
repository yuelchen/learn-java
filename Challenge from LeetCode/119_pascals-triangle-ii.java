class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> previous;
        
        if (rowIndex == 0) {
            previous = new ArrayList<Integer>();
            previous.add(1);
        } else {
            previous = getRow(rowIndex - 1);
            
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0; i<=rowIndex; i++) {
                if(i == 0 || i == rowIndex) {
                    temp.add(1);
                } else {
                    temp.add(previous.get(i) + previous.get(i-1));
                }
            }
            
            previous = temp;
        }
        
        return previous;
    }
}
