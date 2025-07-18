package tcs;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);
        sc.close();
    }
}

