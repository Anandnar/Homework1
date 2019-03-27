import java.util.Scanner;

public class IntChangeValue {
    public static void main(String[] args) {
        int first, second, temporary;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number  :  ");
        first = scanner.nextInt();
        System.out.println("Enter second number :  ");
        second = scanner.nextInt();

        System.out.println( "     --Before swap--     ");
        System.out.println("First number  = " + first);
        System.out.println("Second number = " + second);

        temporary = first;

        first = second;

        second = temporary;

        System.out.println("     --After swap--     ");
        System.out.println("First number  = " + first);
        System.out.println("Second number = " + second);    }
}