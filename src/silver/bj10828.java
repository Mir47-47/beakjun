package silver;

import java.util.Scanner;

public class bj10828 {
    public void solve(){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int choice = 0;
        String temp = "";

        int stack[] = new int[N];
        int top = -1;

        for(int i = 1; i <= N; i++){
            temp = sc.next();
            switch(temp){
                case "push":
                    choice = sc.nextInt();
                    top++;
                    stack[top] = choice;
                    break;
                case "pop":
                    if(top == -1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[top]);
                        top--;
                    }
                    break;
                case "size":
                    System.out.println(top+1);
                    break;
                case "empty":
                    if(top == -1) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(top == -1) {
                        System.out.println(-1);
                    }else {
                        System.out.println(stack[top]);
                    }
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
