package mathematics.print_pattern;

public class PrintPattern {
    private final String newLine = "$";

    public String print(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=num; i>0; i--) {
            for(int n=num; n>0; n--) {
                for(int r=i; r>0; r--) {
                    sb.append(n + " ");
                }
            }
            sb.append(newLine);
        }

        return sb.toString();
    }
}