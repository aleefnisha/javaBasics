package tcs;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] parkingLot = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                parkingLot[i][j] = sc.nextInt();
            }
        }

        int maxOnes = -1;
        int rowIndex = -1;
        for (int i = 0; i < R; i++) {
            int count = 0;
            for (int j = 0; j < C; j++) {
                if (parkingLot[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }
        System.out.println(rowIndex + 1);
    }
}

