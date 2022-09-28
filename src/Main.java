import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scanning for values
        System.out.print("Enter the bill: ");
        double bill = scanner.nextDouble();

        System.out.print("Enter the tip percentage: ");
        double tipPercentage = scanner.nextDouble();

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();

        // Calculating values
        double tipAmount = bill * (tipPercentage / 100.0);
        double totalBill = bill + tipAmount;

        double tipAmountPerPerson = tipAmount / numPeople; // java implicit conversion from int -> double
        double totalBillPerPerson = totalBill / numPeople; // makes this division fine

        // Printing results
        System.out.println();
        System.out.println("Total tip amount: $" + String.format("%.2f", tipAmount + 0.005)); // add 0.005 to force formatter to always round *up*
        System.out.println("Total bill: $" + String.format("%.2f", totalBill + 0.005));       // this is because we are dealing with money

        System.out.println();
        System.out.println("Tip per person: $" + String.format("%.2f", tipAmountPerPerson + 0.005));
        System.out.println("Total per person: $" + String.format("%.2f", totalBillPerPerson + 0.005));
    }
}