package task2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.length() == 0) {
        throw new RuntimeException("Пустую строчку вводить нелья");
        }
        System.out.println(str);
    }
}
