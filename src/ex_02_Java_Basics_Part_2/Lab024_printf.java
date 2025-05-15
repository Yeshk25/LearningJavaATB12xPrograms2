package ex_02_Java_Basics_Part_2;

public class Lab024_printf {
    public static void main(String[] args) {
        int a=10;
        //System.out.println(a);
        //System.out.printf("your value is a= %d" ,a);
        /*
        %d-> int,byte, long,short
        %s-> String
        %f-> float ,double
        %b-> boolean

         */
        int b=20;
        System.out.printf("%d+%d", a,b );
        System.out.println();
        System.out.printf(" a value is %d, b value is %d", a,b);
        System.out.println();
        System.out.println("a = " + a + " , b = " +b);

    }
}
