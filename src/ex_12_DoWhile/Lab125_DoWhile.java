package ex_12_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println("Body!");
            System.out.println(a);
            a++;
        }
        while(a>10); //while(a<10);
        // note:- do while loop basically one time body will be execute even though if its fail bcs writing the
        // condition in bottom
    }
}
