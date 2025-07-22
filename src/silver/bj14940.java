package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj14940 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n][m];
        int[][] distance = new int[n][m];
        int[][] visited = new int[n][m];

        Queue<int[]> q = new LinkedList<>();
//        int startX = 0, startY = 0;//Starting point
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
                distance[i][j] = 10000;
                if (map[i][j] == 2) {
                    q.add(new int[] {i, j, 0, 0});//x, y, distance
                }
            }
        }

//        move(map, distance, startX, startY, n, m, 0);

        while(!q.isEmpty()){
            int[] curr = q.poll();
            if(visited[curr[0]][curr[1]] == 1 || map[curr[0]][curr[1]] == 0) continue; // If already visited, skip
            if(distance[curr[0]][curr[1]] > curr[2]) {// input distance is less than current distance
                distance[curr[0]][curr[1]] = curr[2];
                visited[curr[0]][curr[1]] = 1;
            }

            // Move in all four directions
            if (curr[0] + 1 < n&& visited[curr[0] + 1][curr[1]] == 0) {
                q.add(new int[] {curr[0] + 1, curr[1], curr[2] + 1});
            }
            if (curr[1] + 1 < m && visited[curr[0]][curr[1] + 1] == 0) {
                q.add(new int[] {curr[0], curr[1] + 1, curr[2] + 1});
            }
            if (curr[0] - 1 >= 0 && visited[curr[0] - 1][curr[1]] == 0) {
                q.add(new int[] {curr[0] - 1, curr[1], curr[2] + 1});
            }
            if (curr[1] - 1 >= 0 && visited[curr[0]][curr[1] - 1] == 0) {
                q.add(new int[] {curr[0], curr[1] - 1, curr[2] + 1});
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j =0; j < m; j++) {
                if (map[i][j] == 0) {
                    distance[i][j] = 0; // If it's a wall, set distance to -1
                } else if (distance[i][j] == 10000) {
                    distance[i][j] = -1; // If not reachable, set distance to -1
                }
                System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void move(int[][] map, int[][] distance, int x, int y, int n, int m, int k) {
        if (x < 0 || x > n || y < 0 || y > m||map[x][y]==0) return;//Out of bounds
        if(distance[x][y] < k) return;//Already least distance visited

        distance[x][y] = k;//Set distance

        move(map, distance, x+1, y, n, m, k+1);
        move(map, distance, x, y+1, n, m, k+1);
        move(map, distance, x-1, y, n, m, k+1);
        move(map, distance, x, y-1, n, m, k+1);
    }
}
