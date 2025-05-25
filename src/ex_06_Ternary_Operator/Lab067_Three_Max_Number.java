package ex_06_Ternary_Operator;

public class Lab067_Three_Max_Number {
    public static void main(String[] args) {
        int m1=1;
        int m2=18;
        int m3=-11;
        int max=(m1>m2)?m1:m2;
        int max2=(m1>m2)?(m1>m3)?m1:m2:m3;
        int max3=(m1>m2)?(m1>m3)?m1:m3:((m2>m3)?m2:m3);

        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
    }
}
