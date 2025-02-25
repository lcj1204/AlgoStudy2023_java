package towPointer;

import java.io.*;
import java.util.*;

public class boj_3273 {
    public static ArrayList<Integer> A = new ArrayList<>();
    public static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
//            System.out.println(temp);
            A.add(temp);
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
//        System.out.println("x = " + x);

        Collections.sort(A);
//        System.out.println(A);

        int i = 0;
        int j = A.size() - 1;

        while(i < j){
            int sum = A.get(i) + A.get(j);
            if (sum == x ){
                answer += 1;
                i ++;
                j --;
            } else if (sum < x){
                i ++;
            } else{
                j --;
            }
        }

        System.out.println(answer);
    }
}
