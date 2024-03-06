package Programmers.week27;

import java.util.Arrays;

public class BestSet {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];

        if (s < n) {
            return new int[]{-1};
        }

        int mean = s / n;
        int rest = s % n;
        // System.out.println("mean = " + mean);
        // System.out.println("rest = " + rest);

        for (int i = 0; i < n-rest; i++){
            answer[i] = mean;
        }

        for (int i = n-rest; i < n; i++) {
            answer[i] = mean + 1;
        }

//        for (int i = 0; i < n; i++) {
//         System.out.print(answer[i] + ", ");
//        }

        return answer;
    }

    public static void main(String[] args) {
        BestSet bestSet = new BestSet();
        int[] solution = bestSet.solution(3, 14);

        Arrays.stream(solution)
                        .forEach(e -> System.out.print(e + " "));
    }
}
