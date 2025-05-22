package ex_04_Operators;

public class Lab043_Interview_Concat_plus {
    public static void main(String[] args) {
        String s1="Yash";
        String s2="kopp";

        int a=10;
        int b=10;
        System.out.println(s1+s2+a+b); //join
        System.out.println(a+b+s1+s2); // math next join
        System.out.println(s1+s2+(a+b)); // 1st brackets will resolve then will check other
        // it will work as BODMAS Rule
    }
}
