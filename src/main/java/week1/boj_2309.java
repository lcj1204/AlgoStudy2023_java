package week1;

import java.util.*;

public class boj_2309 {
    public static void main(String[] args) {
        boj_2309 boj2309 = new boj_2309();
        boj2309.solution();
    }

    int[] arr = new int[9];
    int[] answer = new int[7];
    int cnt = 0;

    public void solution() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
        }

        back(arr, answer);
    }

    public void back(int[] arr, int[] answer) {
        if (answer.length == 7) {
            if (Arrays.stream(arr).sum() == 100) {

            }
        }
    }
}
