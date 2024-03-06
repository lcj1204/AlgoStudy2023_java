package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_12869 {
    static int min = Integer.MAX_VALUE;
    static final int[][] mutal = {
                {9, 3, 1},
                {9, 1, 3},
                {3, 9, 1},
                {3, 1, 9},
                {1, 9, 3},
                {1, 3, 9}
    };
    static int[][][] dp = new int[60][60][60];
    static int count = 0;
    static int[] scv = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scv[i] = Integer.parseInt(st.nextToken());
        }

//        for (int i = 0; i < 60; i++) {
//            for (int j = 0; j < 60; j++) {
//                for (int k = 0; k < 60; k++) {
//                    System.out.println(dp[i][j][k]);
//                }
//            }
//        }

        dfs();
    }

    public static void dfs() {

    }
}