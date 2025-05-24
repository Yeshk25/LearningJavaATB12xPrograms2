package ex_05_TypeCasting;

public class Lab061_TypeCasting_used {
    public static void main(String[] args) {
        int course=100;
        float gst=18.45f;
        //int total=course+gst; //Narrowing implicit
        int total=course+(int)gst;// Narrowing explicit
        float total2= course+gst;
        System.out.println(total2);
    }
}
