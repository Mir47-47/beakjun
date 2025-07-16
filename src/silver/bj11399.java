package silver;

import java.util.Arrays;
import java.util.Scanner;

public class bj11399 {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result =0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = arr[i]+temp;
            result += temp;
        }

        System.out.println(result);
    }
}
