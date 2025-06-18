package ex_15_String_Buffer_String_Builder;

public class Lab148_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sbr=new StringBuffer("Java");
        sbr.append(" Programming ");
        System.out.println(sbr);

        sbr.delete(1,8);
        System.out.println(sbr);

        sbr.replace(0,4,"c++");
        System.out.println(sbr);

    }
}
