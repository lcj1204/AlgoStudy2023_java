package week1;

import java.io.*;
import java.util.*;

public class boj_2979 {
    static int[] fare = {0, 0, 0, 0};
    static int[] cul = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        for (int i = 1; i < 4; i++){
            fare[i] = Integer.parseInt(s.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            StringTokenizer s2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(s2.nextToken());
            int end = Integer.parseInt(s2.nextToken());

            for (int j = start; j < end; j++) {
                cul[j] += 1;
            }
        }

        int answer = 0;
        for (int i = 1; i < 101; i++) {
            answer += cul[i] * fare[cul[i]];
        }

        System.out.println(answer);
    }
}
