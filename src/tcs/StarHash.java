package tcs;
import java.util.Scanner;

public class StarHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int starCount = 0, hashCount = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '*') starCount++;
            else if (ch == '#') hashCount++;
        }
        System.out.println(starCount - hashCount);

        sc.close();
    }
}



