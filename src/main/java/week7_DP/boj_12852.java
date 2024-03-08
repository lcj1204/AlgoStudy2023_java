package week7_DP;

import java.io.*;
import java.util.*;

public class boj_12852 {
    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i < input + 1; i++) {
            if (i % 6 == 0) {
                dp[i] = Math.min(Math.min(dp[i/3], dp[i/2]), dp[i-1]) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i/3], dp[i - 1]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        System.out.println(dp[input]);

        while (input > 1) {
            System.out.print(input + " ");
            if (input % 6 == 0) {
                if (dp[input] == dp[input / 3] + 1) {
                    input /= 3;
                } else if (dp[input] == dp[input / 2] + 1) {
                    input /= 2;
                } else {
                    input -= 1;
                }
            } else if (input % 3 == 0) {
                if (dp[input] == dp[input / 3] + 1) {
                    input /= 3;
                } else {
                    input -= 1;
                }
            } else if (input % 2 == 0) {
                if (dp[input] == dp[input / 2] + 1) {
                    input /= 2;
                } else {
                    input -= 1;
                }
            } else {
                input -= 1;
            }
        }
        System.out.print(input);

    }
}
