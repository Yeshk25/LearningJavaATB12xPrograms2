package ex_10_For_Loop;

public class Lab113_Forloop_Even_Odd {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            if(i%2==0) // if(i%2!=0) // for odd number validation
            {
                System.out.println( "Even-->" +i);
                //continue;
            }else {
                System.out.println("Odd-->" +i);
            }
        }
    }
}
