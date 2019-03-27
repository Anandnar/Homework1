import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class GrossSalary {

    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        double Basic_Salary, HRA, DA, TA, PF, Gross_Salary;
        String employeeId;
        String empName;
        System.out.println("Enter Employee ID   : ");
        employeeId = scanner.next();
        System.out.println("Enter Employee Name : ");
        empName = scanner.next();
        System.out.println("Enter Basic Salary  : ");
        Basic_Salary = scanner.nextDouble();

        HRA = Basic_Salary * 10 / 100;
        DA  = Basic_Salary * 8  / 100;
        TA  = Basic_Salary * 9  / 100;
        PF  = Basic_Salary * 20 / 100;

        Gross_Salary = Basic_Salary + HRA + TA + DA - PF;

        System.out.println("Gross Salary : " + Gross_Salary);
    }
}
