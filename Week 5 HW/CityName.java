import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        String a, b, c, d, e, f, A, B, C, D, E, F;
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("Enter alphabet in between A to F : ");
        ch = scanner.next().charAt(0);

        if (ch=='a'|| ch=='A'){
            System.out.println("Amdavad"); }
        else if (ch=='b'|| ch=='B'){
            System.out.println("Bhavnagar"); }
        else if (ch=='c'|| ch=='C'){
            System.out.println("Champaran"); }
        else if (ch=='d'|| ch=='D'){
            System.out.println("Dhangadhra"); }
        else if (ch=='e'|| ch=='E'){
            System.out.println("Endroda"); }
        else if (ch=='f'|| ch=='F'){
            System.out.println("Fareni"); }
        else {System.out.println("Invalid entry");
        }
    }
}


