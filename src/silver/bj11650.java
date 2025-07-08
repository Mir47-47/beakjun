package silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj11650 {
    public void solve() {
        int N = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        Point[] point = new Point[N];
        for(int i = 0; i < N; i++){
            point[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(point, Comparator.comparingInt((Point p) -> p.x).thenComparingInt((Point p) -> p.y));

        for(int i = 0; i < N; i++){
            System.out.println(point[i].x + " " + point[i].y);
        }

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
