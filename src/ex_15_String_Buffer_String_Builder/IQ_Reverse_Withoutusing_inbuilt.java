package ex_15_String_Buffer_String_Builder;

public class IQ_Reverse_Withoutusing_inbuilt {
    public static void main(String[] args) {
        String s0="Yash";
        String s1=new String("Yash");

        StringBuffer sbr=new StringBuffer("Yash");
        StringBuilder sbr2=new StringBuilder("Yash");

        System.out.println(sbr);
        System.out.println(sbr2);
        System.out.println(sbr.reverse());
        System.out.println(sbr2.reverse());

    }
}
