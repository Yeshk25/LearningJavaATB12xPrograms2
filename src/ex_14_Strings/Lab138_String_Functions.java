package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        char r='a';
        System.out.println(r);

        String s1="abcd";
        String s2="ABCD"; // it wont print bcs in SCP already have same value in s1
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));


    }
}
