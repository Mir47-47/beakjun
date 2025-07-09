package silver;

import java.util.Scanner;

public class bj1874 {
    static public void solve(){
        int N = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] print = new int[N];
        int[] stack = new int[N];
        int top = -1;

        for(int i = 0; i < N; i++){
            print[i] = sc.nextInt();
        }

        int current = 1;//input number
        int k=0;//current index of print array
        StringBuilder sb = new StringBuilder();
        do{
            top++;
            stack[top] = current;//push
            current++;
            sb.append("+\n");
            while(stack[top] == print[k]){//pop
                top--;
                sb.append("-\n");
                k++;
                if((k >= N)|| top==-1) break;
            }
        }while((current <= N)&&(top<N));
        if(top != -1){
            System.out.println("NO");
        }else{
            System.out.println(sb.toString());
        }
    }

    static public void solve2(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] stack = new int[N];
        int top = -1;
        int current = 1;
        String p = "";

            int num = sc.nextInt();
            do{
                top++;
                stack[top] = current;//push
                current++;
                p = p+"+\n";
                while(stack[top] == num){//pop
                    top--;
                    p = p+"-\n";
                    if(top==-1) break;
                    num = sc.nextInt();
                }
            }while((current <= N)&&(top<N));

        if(top != -1){
            System.out.println("NO");
        }else{
            System.out.println(p);
        }
    }
}
