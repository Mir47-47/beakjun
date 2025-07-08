package silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj10814 {
    public void solve() {
        int N = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Person[] person = new Person[N];
        for (int i = 0; i < N; i++) {
            person[i] = new Person(sc.nextInt(), sc.next(), i);
        }


        Arrays.sort(person, Comparator.comparing((Person p) -> p.age)
                .thenComparing(p -> p.order));



        for (int i = 0; i < N; i++) {
            System.out.print(person[i].age + " "+ person[i].name+"\n");
        }
    }

    static class Person {
        int age;
        String name;
        int order;

        Person(int age, String name, int order) {
            this.age =  age;
            this.name = name;
            this.order = order;
        }
    }
}
