package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter the age:15");
        Scanner s= new Scanner(System.in);
        int age=s.nextInt();
        if(age>20) {
            System.out.println("you can vote");
        }else {
            System.out.println("You can't");
        }
    }
}
