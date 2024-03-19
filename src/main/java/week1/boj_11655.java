package week1;

import java.io.*;
import java.util.*;

public class boj_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();
        String input = br.readLine();

        for (char word : input.toCharArray()) {
            if (Character.isLetter(word)) {
                if (Character.isLowerCase(word)) {
                    word += 13;
                    if ((int) word >= 123) {
                        word = (char) (97 + (word - 123));
                    }
                }else {
                    word += 13;
                    if ((int) word >= 91) {
                        word = (char) (65 + (word - 91));
                    }
                }
            }
            answer.append(word);
        }

        System.out.println(answer);
    }
}
