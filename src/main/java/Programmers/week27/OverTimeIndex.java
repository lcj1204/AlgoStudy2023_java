package Programmers.week27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OverTimeIndex {
    public long solution(int n, int[] works) {
        long answer = 0;

        int lengthOfWorks = works.length;

        int sum = Arrays.stream(works).sum();
        if (sum <= n){ return 0; } // 이땐 무조건 0

        // 역정렬
        Integer[] sortedWorks = Arrays.stream(works).boxed().toArray(Integer[]::new); // 박싱
        Arrays.sort(sortedWorks, Collections.reverseOrder());

        int maxValue = sortedWorks[0];
        int i = 0;
        while(n > 0){
            if(sortedWorks[i] < maxValue){
                maxValue -= 1;
                i = 0;
            }
            else if (sortedWorks[i] == maxValue){
                sortedWorks[i] -= 1;
                n -= 1;
                i += 1;
            }
        }

        Arrays.stream(sortedWorks)
                .forEach(e -> System.out.print(e + " "));

        for (i = 0; i < lengthOfWorks; i++){
            answer += Math.pow(sortedWorks[i], 2);
        }

        return answer;
    }
}
