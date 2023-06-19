package Operator_Program;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int op1 = a + b * c;
        System.out.println("Operation one :"+ op1 );
        int op2 = c + a / b;
        System.out.println("Operation two :"+ op2);
        int op3 = a % b + c;
        System.out.println("Operation three :"+ op3);
        int op4 = a * b + c;
        System.out.println("Operation four :"+ op4);

        if ((op1 > op2) && (op1 > op3 ) && (op1 > op4)){
            System.out.println(op1 +" 4Operation one is Max");
        }
        else if ((op2 > op3) && (op2 > op4)){
            System.out.println(op2 +" Operation two is Max");
        }
        else if ((op3 > op4)){
            System.out.println(op3 +" Operation three is Max");
        }
        else {
            System.out.println(op4 +" Operation four is Max");
        }
        if ((op1 < op2) && (op1 < op3 ) && (op1 < op4)){
            System.out.println(op1 +" Operation is Min");
        }
        else if ((op2 < op3) && (op2 < op4)){
            System.out.println(op2 +" Operation two is Min");
        }
        else if ((op3 < op4)){
            System.out.println(op3 +" Operation three is Min");
        }
        else {
            System.out.println(op4 +" Operation four is Min");
        }
    }
}
