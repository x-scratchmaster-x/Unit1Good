package Lab1;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Charge {
	
	static Locale locale = new Locale("en", "US");

	static NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
	
	private static double findCharge (double bal) {
		if (bal  < 50.00) {
			return bal;
		} else if (bal <= 300) {
			return 50.0;
		} else {
			return ( bal * 0.2 );
		}
		
	}
	private static void printResult (double balance, double charge, double newBal, double newCharge) {
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println("");
		System.out.println("Previous Balance: \t" + currency.format(balance));
		System.out.println("Additional Charges: \t" + currency.format(newCharge));
		System.out.println("Interest: \t\t" + currency.format(balance*0.02));
		System.out.println("");
		System.out.println("New Balance: \t\t" + currency.format(newBal));
		System.out.println("");
		System.out.println("Minimum Payment: \t" + currency.format(charge));
	}
	public static void main(String[] args) {
		
		
		double balance;
		double newCharges;
		double finalCharge;
		double newBal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Old Balance: ");
		balance = scan.nextDouble();
		System.out.print("Enter Any Charges: ");
		newCharges = scan.nextDouble();
		balance += newCharges;
		newBal = balance * 1.02;
		finalCharge = findCharge(balance);
		printResult(balance, finalCharge, newBal, newCharges);
		
	}
}
