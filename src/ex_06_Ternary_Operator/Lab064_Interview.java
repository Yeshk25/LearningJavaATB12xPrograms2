package ex_06_Ternary_Operator;

public class Lab064_Interview {
    public static void main(String[] args) {
        int age=21;
        String Result= (age >  18) ?(age >  25 ?"In Goa, You can drint": " In Goa, you can't drink") :  " you can't go Goa";
        System.out.println(Result);
    }
}
