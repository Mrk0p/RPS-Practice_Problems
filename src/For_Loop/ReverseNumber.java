package For_Loop;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();
        int reverse = 0;
        for (int temp=num; temp !=0; temp = temp/10 ) {
            int remainder = temp%10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of a given number is :" + reverse);
    }
}
