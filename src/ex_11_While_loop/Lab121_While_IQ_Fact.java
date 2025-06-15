package ex_11_While_loop;

import java.util.Scanner;

public class Lab121_While_IQ_Fact {

    // Factorial Program

    // The logic building formula we are discussing.
    // Step number one, you have to figure out what is the data type for input and output.
    // Step number two, write a rough logic around this.
    // Step number three, write a proper logic around this.
    // Step number four, optimize.
    // Step number five, which is edge cases.
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the fact nbr:- ");

        // this check is verify the user enter the integer

        if(!s.hasNextInt()){
            System.out.println("Enter the int,return the program");
        }

        int number=s.nextInt();
        int fact=1;

        // this check verify the nbr is lessthen zero
        if(number<=0){
            System.out.println("Fact is" +fact);
        }

        int i=1;
        while(i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("Fact is-->" +fact);

    }







}
