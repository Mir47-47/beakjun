package silver;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class bj17219 {
    public void solve() throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(); // Number of websites
//        int M = sc.nextInt(); // Number of passwords

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]); // Number of websites
        int M = Integer.parseInt(s[1]); // Number of passwords

        HashMap<String, String> passwordMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
//            String site = sc.next();
//            String password = sc.next();
            String[] pass = br.readLine().split(" ");
            String site = pass[0];
            String password = pass[1];
            passwordMap.put(site, password); // Store the site and its password
        }

        for (int i = 0; i < M; i++) {
//            String losspasswordsite = sc.next();
            String losspasswordsite = br.readLine();
            if (passwordMap.containsKey(losspasswordsite)) {
//                System.out.println(passwordMap.get(losspasswordsite));
                bw.write(passwordMap.get(losspasswordsite) + "\n");
            }
        }
        bw.flush();
    }
}
