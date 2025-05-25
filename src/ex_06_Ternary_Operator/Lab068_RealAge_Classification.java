package ex_06_Ternary_Operator;

public class Lab068_RealAge_Classification {
    public static void main(String[] args) {
        String user_input=args[0];
        System.out.println(user_input);

        int age=Integer.parseInt(user_input);
        System.out.println(age);

        String Result=(age<18)?"Minor":(age<64)?"Adult":"Senior";
        System.out.println(Result);

    }
}
