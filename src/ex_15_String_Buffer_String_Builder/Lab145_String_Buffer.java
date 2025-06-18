package ex_15_String_Buffer_String_Builder;

public class Lab145_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sbr=new StringBuffer("Yash");
        sbr.append("koppu");
        System.out.println(sbr);

        String s1="yash";
        s1=s1+"koppu";
        System.out.println(s1);
    }
}
