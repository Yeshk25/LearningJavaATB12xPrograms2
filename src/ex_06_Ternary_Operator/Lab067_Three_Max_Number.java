package ex_06_Ternary_Operator;

public class Lab067_Three_Max_Number {
    public static void main(String[] args) {
       int m1=2;
        int m2=9;
        int m3=-11;
        int max=(m1>m2)?m1:m2;
        int max2=(m1>m2)?(m1>m3)?m1:m2:m3;
        int max3=(m1>m2)?(m1>m3)?m1:m3:((m2>m3)?m2:m3);

        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);

        /*int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);*/
    }
}
