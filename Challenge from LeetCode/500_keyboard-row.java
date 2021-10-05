import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    
    Pattern firstRow = Pattern.compile("^[qwertyuiop]*$");
    Pattern secondRow = Pattern.compile("^[asdfghjkl]*$");
    Pattern thirdRow = Pattern.compile("^[zxcvbnm]*$");
    
    public String[] findWords(String[] words) {
        
        List<String> matched = new ArrayList<>();
        for(String word: words) {
            if(firstRow.matcher(word.toLowerCase()).find() || 
               secondRow.matcher(word.toLowerCase()).find() || 
               thirdRow.matcher(word.toLowerCase()).find()) {
                
                matched.add(word);
            } 
        }
        
        return matched.toArray(new String[matched.size()]);
    }
}
