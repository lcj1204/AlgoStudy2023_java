package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class boj_10808 {
    static Map<String, Integer> dict = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (String a : alpha.split("")) {
            dict.put(a, 0);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (String a : s.split("")) {
            dict.put(a, dict.get(a) + 1);
        }

        for (Integer i : dict.values()) {
            System.out.print(i + " ");
        }
//        solution2();
    }

    public static void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alpha = new int[26];
        for (int i = 0; i < input.length(); i++) {
            alpha[(int) input.charAt(i) - 97] += 1;
        }

        for (int i : alpha) {
            System.out.print(i + " ");
        }
    }
}
