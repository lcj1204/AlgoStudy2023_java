package week1;

import java.io.*;
import java.util.*;

public class boj_9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

//        String input = br.readLine();

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), "*");
        String left = tokenizer.nextToken();
        String right = tokenizer.nextToken();
        int len = left.length() + right.length();
//        int starIndex = input.indexOf("*");
//        String left = input.substring(0, starIndex);
//        String right = input.substring(starIndex + 1, input.length());

        for (int i = 0; i < inputCount; i++) {
            String word = br.readLine();
            int wordLength = word.length();

            if (wordLength < len){
                System.out.println("NE");
                continue;
            }

            String wordF = word.substring(0, left.length());
            String wordB = word.substring(wordLength - right.length(), wordLength);
//            String wordF = word.substring(0, starIndex);
//            String wordB = word.substring(wordLength - back.length(), wordLength);

            if (wordF.equals(left) && wordB.equals(right)){
                System.out.println("DA");
            }else {
                System.out.println("NE");
            }
        }
    }
}
