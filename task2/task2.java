package task2;

public class task2 {
    public static void main(String[] args) {
        try {
         int [] Array = {1,2,3,4,5,6,7,8,9,10};
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
      }
}
