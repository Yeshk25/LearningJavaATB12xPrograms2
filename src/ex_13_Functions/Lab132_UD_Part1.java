package ex_13_Functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        wp_wr_greet();

        String msg=greet_with_hello_wp_with_rt();
        System.out.println(msg);

        greet_with_details("yash",40,1000);
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Name");
        String name=s.next();
        System.out.println("Enter age");
        int age=s.nextInt();
        System.out.println("Enter Sal");
        double sal=s.nextDouble();

        greet_with_details(name, age, sal);


        //  4. With Parameters and With Return Type
        int sum = sum_of_two_nbrs(3,4);
        int sum2 = sum_of_two_nbrs(190,900);
        //int sum3 = sum_of_two_numbers(2345,5432);
      //  int sum4 = sum_of_three_numbers(2345,5432, 5432);


        System.out.println(sum);
        System.out.println(sum2);
        //System.out.println(sum3);
        //System.out.println(sum4);


    }


    //1.Without Parameters and Without Return Type

    static void wp_wr_greet(){
        System.out.println("Hi,How r u");
    }

    // 2.Without Parameters but With Return Type

    static String greet_with_hello_wp_with_rt(){
        System.out.println("Hi");
        return "Hi, how r u";
    }

    // 3.With Parameters and Without Return Type

    static void greet_with_details(String name,int age,double sal){
        System.out.println("your name is-->" +name+ "\n your age is" +age+ "\n your sal is" +sal);
    }
    // 4.With Parameters and With Return Type
    static int sum_of_two_nbrs(int a, int b){
        return a+b;
    }
    static int sum_of_three_nbrs(int a,int b, int c){
        return a+b+c;
    }



}