import java.util.*;

public class MortgagePrice
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double interestPay = 0;
		double interestTotal = 0;
		double balance = 0;
		double principal = 0;
		double mortgage = 0;
		double interestRate = 0;
		int term = 0;

		System.out.println("Enter the loan term (years): ");
		term = scan.nextInt();
		System.out.println("Enter the loan amount: ");
		balance = scan.nextDouble();
		System.out.println("Enter the monthly mortgage payment amount: ");
		mortgage = scan.nextDouble();
		System.out.println("Enter the interest rate (percent form with numbers only): ");
		interestRate = scan.nextDouble();

		for (int i = 0; i < term * 12; i++)
		{
			interestPay = balance * (interestRate / 1200);
			principal = mortgage - interestPay;
			balance = balance - principal;
			interestTotal = interestTotal + interestPay;
		}
		System.out.println("\nTotal Interest Paid: " + interestTotal);
		System.out.println("Balance: " + balance);
	}
}