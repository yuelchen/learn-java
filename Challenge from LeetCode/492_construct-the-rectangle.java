class Solution {
    public int[] constructRectangle(int area) {
        
        int[] dimension = {area, 1};
        int difference = dimension[0] - dimension[1];
        
        for(int width=2; width<=Math.sqrt(area); width++) {
            if(area % width == 0) {
                int length = area / width;
                if(length >= width && (difference > (length - width))) {
                    dimension[0] = length;
                    dimension[1] = width;
                } else {
                    break;   
                }
            }
        }
        
        return dimension;
    }
}
