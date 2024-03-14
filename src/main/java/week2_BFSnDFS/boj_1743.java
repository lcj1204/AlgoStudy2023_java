package week2_BFSnDFS;

import java.io.*;
import java.util.*;

public class boj_1743 {
    private static int[][] arr, visited, candidate;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());

        N = Integer.parseInt(s.nextToken());
        M = Integer.parseInt(s.nextToken());
        K = Integer.parseInt(s.nextToken());

        arr = new int[N][M];
        visited = new int[N][M];
        candidate = new int[K][2];

        for (int i = 0; i < K; i++) {
            s = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(s.nextToken());
            int y = Integer.parseInt(s.nextToken());

            arr[x - 1][y - 1] = 1;
            candidate[i][0] = x - 1;
            candidate[i][1] = y - 1;
        }

        int max = 0;
        for (int[] c : candidate) {
            int startX = c[0];
            int startY = c[1];
            max = Math.max(max, bfs(startX, startY, 0));
        }

        System.out.println(max);
    }

    private static int bfs(int startX, int startY, int count){
        Queue<Integer[]> q = new LinkedList();
        q.offer(new Integer[]{startX, startY});
        count += 1;
        visited[startX][startY] = -1;

        while (!q.isEmpty()) {
            Integer[] cul = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cul[0] + dx[i];
                int ny = cul[1] + dy[i];

                if ((0 <= nx && nx < N) && (0 <= ny && ny < M)) {
                    if (arr[nx][ny] == 1 && visited[nx][ny] == 0) {
                        visited[nx][ny] = -1;
                        count += 1;
                        q.offer(new Integer[]{nx, ny});
                    }
                }
            }
        }

        return count;
    }
}
