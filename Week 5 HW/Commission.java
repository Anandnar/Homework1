import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        double CommissionRate = 0.0;
        double TotalSales, Commission;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total sales: ");
        TotalSales = scanner.nextDouble();

        if (TotalSales >= 50000) {
            CommissionRate = 0.35;
            Commission = CommissionRate * TotalSales;
            System.out.println("The Commission is: " + Commission);
        }
        if (TotalSales >= 30000 && TotalSales < 50000) {
            CommissionRate = 0.20;
            Commission = CommissionRate * TotalSales;
            System.out.println("The Commission is: " + Commission);
        }
        if (TotalSales >= 20000 && TotalSales < 30000) {
            CommissionRate = 0.10;
            Commission = CommissionRate * TotalSales;
            System.out.println("The Commission is: " + Commission);
        }
        if (TotalSales >= 10000 && TotalSales < 20000){
            CommissionRate = 0.5;
        Commission = CommissionRate * TotalSales;
        System.out.println("The Commission is: " + Commission);
    }
     else if (TotalSales <=10000)   {
        CommissionRate = 0.2;
        Commission = CommissionRate * TotalSales;
        System.out.println("The Commission is: " + Commission);
    }
    }
}