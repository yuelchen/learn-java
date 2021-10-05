class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) {
            return new ArrayList<List<Integer>>();
        } else if(numRows == 1) {
            List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
            List<Integer> triangleEntry = new ArrayList<Integer>();
            
            triangleEntry.add(1);
            pascalsTriangle.add(triangleEntry);
            return pascalsTriangle;
        } else {
            List<List<Integer>> pascalsTriangle = generate(numRows - 1);
            List<Integer> previousEntry = pascalsTriangle.get(pascalsTriangle.size() - 1);
            
            List<Integer> triangleEntry = new ArrayList<Integer>();
            for(int i=0; i<numRows; i++) {
                if(i == 0 || i == numRows - 1) {
                    triangleEntry.add(1);
                } else {
                    triangleEntry.add(previousEntry.get(i) + previousEntry.get(i-1));
                }
            }
            
            pascalsTriangle.add(triangleEntry);
            return pascalsTriangle;
        }
    }
}
