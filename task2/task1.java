package task2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String nambers = scanner.nextLine();
        try {
            float numbers = Float.parseFloat(nambers);
            System.out.println(numbers);
            break;
        } catch (Exception e) {
           System.out.println("Ошибка");
        }
    }
}
}