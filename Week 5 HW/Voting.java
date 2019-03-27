import java.util.Scanner;

public class Voting {
        public static void main(String[] args) {
            int age;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the year you want to check : ");
            age = sc.nextInt();

            if (age>=18)
            {
                System.out.println("person is eligible for voting");
            }
            else
            {
                System.out.println("person is not eligible for voting\n");
            }
        }
    }
