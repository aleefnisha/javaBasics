package tcs;
import java.util.Scanner;
public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int N=sc.nextInt();
        int product=1;
        N=Math.abs(N);
        while (N > 0) {
            int digit = N % 10;
            product *= digit;
            N = N / 10;
        }
        System.out.println(product);
    }
}
