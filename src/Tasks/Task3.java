package Tasks;

public class Task3 {
    public static void main(String[] args) {
        int age=25;

        String Result= (age<18)? "minor":(age<65)?"senior ":"Adult";
        System.out.println(Result);
    }
}
