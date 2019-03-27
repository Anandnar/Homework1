import java.util.Scanner;

public class MarkSheet {
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

        int total;
        total=s1+s2+s3;
        int percent = total/3;

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
        System.out.println("Total       :       "+total);
        System.out.println("Percentage  :       "+percent);

        if(percent>=80)
        {
            System.out.println("Grade      :       A+");
        }

        if(percent>=60 && percent<80)
        {
            System.out.println("Grade      :       A");
        }

        if(percent>=50 && percent<60)
        {
            System.out.println("Grade      :       B");
        }

        if(percent>=35)
        {
            System.out.println("Grade      :       C");
        }
        else
            {
                System.out.print("Result      :       Fail");
        }
    }
}


