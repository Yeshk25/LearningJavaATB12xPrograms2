package ex_15_String_Buffer_String_Builder;

public class Lab147_StringBulider {
    public static void main(String[] args) {
        StringBuilder srbr=new StringBuilder("Hello");
                srbr.append("world");
        srbr.reverse();
        System.out.println(srbr);
    }
}
