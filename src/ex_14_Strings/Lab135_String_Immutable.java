package ex_14_Strings;

//String is immutable does not change the value
public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name="yash"; // string constant pool-scp
        name.toUpperCase();
        System.out.println(name);
    }
}
