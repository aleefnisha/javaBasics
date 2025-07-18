public class BinaryConversion {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int reminder = binary % 10;

            decimal += (reminder * Math.pow(2, power));
            power++;
            binary = binary / 10;

        }
        System.out.println(decimal);
    }
}

