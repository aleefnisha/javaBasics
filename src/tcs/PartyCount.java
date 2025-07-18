package tcs;
import java.util.Scanner;

public class PartyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] E = new int[T];
        int[] L = new int[T];

        for (int i = 0; i < T; i++) E[i] = sc.nextInt();
        for (int i = 0; i < T; i++) L[i] = sc.nextInt();

        int max = 0, current = 0;
        for (int i = 0; i < T; i++) {
            current += E[i] - L[i];
            if (current > max) max = current;
        }

        System.out.println(max);
        sc.close();
    }
}

