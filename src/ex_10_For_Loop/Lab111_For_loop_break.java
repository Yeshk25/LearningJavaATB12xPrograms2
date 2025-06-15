package ex_10_For_Loop;

public class Lab111_For_loop_break {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            //System.out.println(i);
            if(i==5){
                //System.out.println(i);
                break; // 5 will be skip
            }
            System.out.println(i);
        }
    }
}
