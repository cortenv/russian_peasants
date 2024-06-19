import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input two numbers:");

        Scanner scan1 = new Scanner(System.in);
        int firstNum = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        int secondNum = scan2.nextInt();

        System.out.println("Your first number is " + firstNum + " and your second number is " + secondNum + ".");

        int finalNum = 0;

        while (firstNum > 0) {
            System.out.println(firstNum + " " + secondNum);
            if (!isFirstNumEven(firstNum)) {
                finalNum += secondNum;
            }
            firstNum = divideByTwo(firstNum);
            secondNum = multiplyByTwo(secondNum);
        }

        System.out.println("The result is " + finalNum);
    }

    static boolean isFirstNumEven(int firstNum) {
        return firstNum % 2 == 0;
    }

    static int divideByTwo(int num){
        return num / 2;
    }

    static int multiplyByTwo(int num){
        return num * 2;
    }

}