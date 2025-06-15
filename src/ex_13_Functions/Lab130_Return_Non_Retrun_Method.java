package ex_13_Functions;

public class Lab130_Return_Non_Retrun_Method {

    //step-2 calling
    public static void main(String[] args) {
        non_return_type_func();
        int i=return_type_func();
        System.out.println(i);

    }




    //step-1 defination
    static void non_return_type_func(){
        System.out.println("Hi, No return type");
    }
    static int return_type_func(){
        System.out.println("Hi, Return type");
        return 10;
    }
}
