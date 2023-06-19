package If_Else;

import java.util.Scanner;

public class Unit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();

        if ( num == 1 ) {
            System.out.println("unit");
        }
        else if ( num == 10 ) {
            System.out.println("Tens");
        }
        else if ( num == 100 ) {
            System.out.println("Hundred");
        }
        else if ( num == 1000 ) {
            System.out.println("Thousand");
        }
        else {
            System.out.println("Enter the only specific number ");
        }
    }

}
