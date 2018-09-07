import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        int salary;
        double amountPaid = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Salary:");
        salary = scan.nextInt();

        if (salary < 10000) {
            amountPaid = 0;
        }

        if (salary >= 10000 && salary < 25000) {
            amountPaid = salary * 0.1;
        }

        if (salary >= 25000 && salary < 75000) {
            amountPaid = (salary * 0.2) + 2500;
        }

        if (salary >= 75000 && salary < 250000) {
            amountPaid = (salary * 0.3) + 17500;
        }

        if (salary >= 250000) {
            amountPaid = (salary * 0.5) + 92500;
        }

        System.out.println("Amount to be paid is= " + amountPaid);

        

    }
}