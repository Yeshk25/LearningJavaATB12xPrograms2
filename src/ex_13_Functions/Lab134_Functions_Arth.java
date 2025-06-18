package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Functions_Arth {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= readInt(s, "Enter the nbr1");
        int b= readInt(s,"Enter the nbr2");

        int result_sum=sum(a,b);
        System.out.println("Result is:" +result_sum);
    }
    static int readInt(Scanner s, String Prompt){
        System.out.println("Promot");
        if(s.hasNextInt()){
            return s.nextInt();
        }else {
            System.out.println("Enter int only");
            return -1;
            }
        }
    static int sum(int a, int b){
        return a+b;
    }
}
