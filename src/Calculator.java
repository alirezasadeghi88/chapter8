import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number 1 : ");
        double num1 = input.nextDouble();
        System.out.println("Enter your Opteration : ");
        String opt = input.next();
        System.out.println("Enter your number 2 : ");
        double num2 = input.nextDouble();

        double result = 0;
        switch (opt) {
            case "+" :
                result = sum(num1 , num2);
                break;
            case "-" :
                result = min(num1 , num2);
                break;
            case "/" :
                result = div(num1 , num2);
                break;
            case "%" :
                result = rem(num1 , num2);
                break;
            case "*" :
                result = mol(num1 , num2);
                break;
        }
        System.out.println(result);
    }

    public static double rem(double a , double b) {
        return a % b;
    }

    public static double div(double num1 , double num2) {
        return num1 / num2;
    }

    public static double sum(double num1 , double num2) {
        return num1 + num2;
    }

    public static double min(double num1 , double num2) {
        return num1 - num2;
    }

    public static double mol(double num1 , double num2) {
        return num1 * num2;
    }
}













