import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = scanner.nextInt();
        boolean even_odd = number%2==0 ? true:false;

        if(even_odd)
        {
            System.out.println("The given number " +number+ " is Even ");
        }
        else
        {
            System.out.println("The given number " +number+ " is Odd ");
        }
    }
}









