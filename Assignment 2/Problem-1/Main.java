import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char maritalStatus;
        System.out.print("Are you married?(Enter 'y or Y' for yes or 'n or N' for no): ");
        maritalStatus= in.next().charAt(0);

        double income;
        double tax;

        MarriedPersonTax married= new MarriedPersonTax();
        SinglePersonTax single = new SinglePersonTax();

        if(maritalStatus=='y' || maritalStatus=='Y'){
            System.out.print("Enter your income in dollar: ");
            income= in.nextDouble();
            tax=married.incomeTax(income);
            System.out.printf("The tax is: %.2f$\n",tax);
        }

        else if(maritalStatus=='n' || maritalStatus=='N'){
            System.out.print("Enter your income in dollar: ");
            income= in.nextDouble();
            tax=single.incomeTax(income);
            System.out.printf("The tax is: %.2f$\n",tax);
        }

        else{
            System.out.println("\nWrong Keyword! Try again.");
        }
    }
}
