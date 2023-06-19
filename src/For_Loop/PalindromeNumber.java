package For_Loop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();

        int originalNum = num;
        int reverseNum = 0;

        for (int temp=num; temp !=0; temp=temp/10) {
            int reminder = temp%10;
            reverseNum = reverseNum * 10 + reminder;
        }
        if (originalNum == reverseNum) {
            System.out.println("Number is palindrome :"+ originalNum);
        }
        else {
            System.out.println("Number is not palindrome :"+ originalNum);
        }
    }
}
