import silver.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        bj10816 solution = new bj10816();
//        solution.solve2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of solutions : ");
        String problemNumber = sc.nextLine();

        String className = "silver.bj" + problemNumber;

        try{
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();

            System.out.println("bj" + problemNumber + " solved start");
            clazz.getMethod("solve").invoke(obj);
        } catch (ClassNotFoundException e){
            System.out.println("Class not found");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}