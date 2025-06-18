package ex_14_Strings;

import java.util.SortedMap;

public class Lab141_String_IQ_p2 {
    public static void main(String[] args) {
        String s1="Yash";
        String s4="Yash";

        String s2=new String("Yash");
        String s3=new String("Yash");

        // == -> Comparison -> String => this check the ref location

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        //System.out.println(s1.equals(s4));



    }
}
