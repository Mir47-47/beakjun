package silver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class bj1764 {
    public void solve() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of people who can hear
        int M = sc.nextInt();

        String[] names = new String[500001];
        for (int i = 0; i < N; i++) {
            names[i] = sc.next();
        }

        Arrays.sort(names);

        String name = "";
        int count = 0;
//        String[] NotNames = new String[N];
        StringBuilder NotNames = new StringBuilder();

        for (int i = 0; i < M; i++) {
            name = sc.next();
            for(int j = 0; j < N; j++) {
                if (name.equals(names[j])) {
                    names[j] = "";
                    NotNames.append(name+"\n");
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
        System.out.println(NotNames.toString());

    }

    public void solve2(){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of people who can hear
        int M = sc.nextInt();

        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String name = sc.next();
            map.put(name, name);
        }

        String name = "";
        int count = 0;
        String[] notnames = new String[500001];
        //        StringBuilder NotNames = new StringBuilder();

        for (int i = 0; i < M; i++) {
            name = sc.next();
            if(map.containsKey(name)) {
                notnames[count] = name;
//                NotNames.append(name + "\n");
                count++;
            }
        }

        System.out.println(count);
        String[] result =Arrays.copyOf(notnames, count);
        Arrays.sort(result);
        for(int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
    }
}
