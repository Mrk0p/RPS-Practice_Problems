package Operator_Program;

import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month :");
        int month = scanner.nextInt();
        System.out.println("Enter a day :");
        int day = scanner.nextInt();

       if ((month <= 3 ) && (month >= 6) || (day <= 20)){
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }
    }
}
