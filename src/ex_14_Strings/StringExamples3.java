package ex_14_Strings;

public class StringExamples3 {
    public static void main(String[] args) {
        String s="Java";
        char c=s.charAt(2);
        System.out.println(c);

        int r="abc".compareToIgnoreCase("ABC");
        System.out.println(r);

        int idx="Java".indexOf("a");
        System.out.println(idx);

        boolean b="".isEmpty();
        System.out.println(b);

        String s11 = String.join("z-", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

    }

}
