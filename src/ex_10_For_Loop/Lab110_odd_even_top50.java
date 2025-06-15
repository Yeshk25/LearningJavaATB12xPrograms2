package ex_10_For_Loop;

public class Lab110_odd_even_top50 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println("Even-->" +i); // if condition is false it wont print if true then only it will print
            }
        }
    }
}
