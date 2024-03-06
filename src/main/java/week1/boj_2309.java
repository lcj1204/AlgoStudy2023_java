package week1;

import java.util.*;

public class boj_2309 {
    static ArrayList<Integer> arr = new ArrayList<>();
    static int target = 0; // 두개를 더해서 target이 되는 조합을 찾는다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++){
            arr.add(scanner.nextInt());
        }

        target = arr.stream().
                mapToInt(Integer::intValue)
                .sum() - 100;

        int find = 0;
        boolean flag = false;
        for (int i = 0; i < arr.size() - 1; i++) {

            find = target - arr.get(i);

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == find) {
                    arr.remove(j);
                    flag = true;
                    break;
                }
            }

            if (flag) {
                arr.remove(i);
                Collections.sort(arr);

                arr.forEach(System.out::println);
                return;
            }

        }

    }
}
