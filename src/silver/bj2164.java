package silver;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class bj2164 {
    public void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            q.add(i+1);
        }
        int sum = 0 ;
        while(q.size()>1){
            if(sum%2==0) {
                q.poll();
                sum++;
            }
            else {
                int temp = q.poll();
                q.add(temp);
                sum++;
            }
        }
        System.out.println(q.poll());
    }
}