package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch_Print_Day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the day to  1 to 7");
        //int day=s.nextInt();
        if (s.hasNextInt()) {
            int day = s.nextInt();


            switch (day) {
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("thur");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("Please enter valid day number");

            }
        } else {
            System.out.println("you entered non int values");
        }
    }
}
