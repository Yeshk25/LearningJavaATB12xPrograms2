package ex_10_For_Loop;

public class Lab112_for_loop_continue {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            if(i==5){
                continue; // 5 will be skip
            }
            System.out.println(i);

        }
    }
}
