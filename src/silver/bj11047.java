package silver;

import java.util.Scanner;

public class bj11047 {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of coin types
        int K = sc.nextInt(); // Total amount to make

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt(); // Read each coin value
        }
        int count = 0; // Count of coins used

        for (int i = N - 1; i >= 0; i--) { // Start from the largest coin
            while (K >= coins[i]) { // While we can use this coin
                K -= coins[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
