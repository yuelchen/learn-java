package mathematics.binary_to_decimal;

public class BinaryToDecimal {
    public int calculate(int binary) {
        int decimal = 0;
        int power = 0;
        while(binary > 0) {
            int digit = binary % 10;
            binary = binary / 10;

            int binaryPower = (int) Math.pow(2, power);
            decimal += (digit * binaryPower);
            power++;
        }

        return decimal;
    }
}
