import java.util.Scanner;

public class Calculator{

    // main method apply
    public static void main(String[] args) {

        // Scanner object has been added. Predefine method
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer number: ");

        //
        int a = scanner.nextInt();

        System.out.println("Enter second integer number: ");
        int b = scanner.nextInt();

        System.out.println("Addition of " +a+ " and " +b+ " = " +(a+b));
        }
    }

