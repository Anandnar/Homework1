import java.util.Scanner;

public class NumbAlpSym {
    public static void main(String[] args) {

        char input;
        int temp;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter The Input Character : ");
        input=s.next().charAt(0);

        temp=(int) input;

        if(temp>=65 && temp<=122)
        {
            System.out.println(input+" is an Alphabet");
        }
        else if(temp>=48 && temp<=57)
        {
            System.out.println(input+" is a Digit");
        }
        else
        {
            System.out.println(input+ " Is A Special Symbol");
        }

    }
}
