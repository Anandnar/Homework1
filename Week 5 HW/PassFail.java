import java.util.Scanner;

public class PassFail {
        public static void main(String[] arg)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the name of Student   :");
            String name=sc.next();
            System.out.print("Enter the Roll Number       :");
            String roll=sc.next();
            System.out.print("Enter the Marks of Maths    :");
            int s1=sc.nextInt();
            System.out.print("Enter the Marks of English  :");
            int s2=sc.nextInt();
            System.out.print("Enter the Marks of Science  :");
            int s3=sc.nextInt();

            int marks;
            marks= s1+s2+s3;
            int percent = marks/3;

            System.out.println("        Mark sheet");
            System.out.println("--------------------------------------------------------");
            System.out.println("Name        :"+name);
            System.out.println("Roll No.    :"+roll);
            System.out.println("--------------------------------------------------------");
            System.out.println("Subject     :     Marks");
            System.out.println("Maths       :       "+s1);
            System.out.println("English     :       "+s2);
            System.out.println("Science     :       "+s3);
            System.out.println("--------------------------------------------------------");
            System.out.println("Total       :       "+marks);
            System.out.println("Percentage  :       "+percent);

            if(percent<=100 && marks>35)
            {
            }
            else
            {
                System.out.print("Result      :       Fail");
            }
        }
    }