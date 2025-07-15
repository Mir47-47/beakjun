package silver;

import java.util.Scanner;

public class bj10816 {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[20000001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num + 10000000]++;
        }
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            sb.append(arr[num + 10000000]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
