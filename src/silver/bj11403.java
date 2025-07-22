package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj11403 {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1) {
                    q.add(new int[]{i, j});
                }
            }
        }

        boolean[] checked = new boolean[n];
        while (!q.isEmpty()) {
            int[] current = q.poll();
            checked = new boolean[n];
            graphline(graph, current[0], current[1], checked);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void graphline(int[][] graph, int start,int current, boolean[] checked) {
        //탐색이 끝난 층일 경우 이동가능한 경로 받아오기
        if (checked[current]) {
            for (int i = 0; i < graph.length; i++) {
                if (graph[current][i] == 1) {
                    graph[start][i] = 1;
                }
            }
            return;
        }
        //탐색이 끝남을 표시
        checked[current] = true;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (graph[current][i] == 1 && !checked[i]) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int next = q.poll();
            graphline(graph, current, next, checked);
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[current][i] == 1) {
                graph[start][i] = 1;
            }
        }

    }

    public void solve2() {}


}
