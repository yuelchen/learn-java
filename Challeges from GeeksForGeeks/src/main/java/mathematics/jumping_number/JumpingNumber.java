package mathematics.jumping_number;

public class JumpingNumber {
    public String find(int number) {
        StringBuilder sb = new StringBuilder();
        for(int index=0; index<=number; index++) {
            if(this.isJumping(index)) {
                sb.append(String.valueOf(index) + " ");
            }
        }

        return sb.toString().trim();
    }

    public boolean isJumping(int number) {
        if(number < 10) {
            return true;
        }
        else {
            int previous = -1;
            while(number > 0) {
                int digit = (number % 10);
                if(previous == -1) {
                    previous = digit;
                }
                else {
                    if(((previous - 1) == digit) || ((previous + 1) == digit)) {
                        previous = digit;
                    }
                    else {
                        return false;
                    }

                }

                number /= 10;
            }

            return true;
        }
    }
}