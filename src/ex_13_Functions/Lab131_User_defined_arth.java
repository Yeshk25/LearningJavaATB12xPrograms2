package ex_13_Functions;

public class Lab131_User_defined_arth {
    public static void main(String[] args) {
        int r = sum_of_two_nbrs(4, 5,7); // calling method
        System.out.println(r);

    }

        // definition
        static int sum_of_two_nbrs(int a, int b, int c){
            return a+b+c;
        }
    }

