package ex_08_If_Condition;

public class Lab079_if {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        System.out.println("Your age is " +age);
        if(age>18) {
            System.out.println("you can vote");
        }else {
            System.out.println("You cont vote");
        }
    }
}
