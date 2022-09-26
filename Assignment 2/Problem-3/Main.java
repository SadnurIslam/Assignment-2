import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year= in.nextInt();
        boolean leapYear= false;

        Year yearObject= new Year();
        leapYear= yearObject.isLeapYear(year);

        System.out.println(year+" is a leap year is "+leapYear);


    }
}
