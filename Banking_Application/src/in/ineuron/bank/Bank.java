package in.ineuron.bank;
import java.util.Scanner;

public class Bank {
	int balance=10000;
	
	public void checkBalance() {
		System.out.println("Your balance is : "+balance);
	}
	
	public void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			System.out.println("Deposited Successfully");
			System.out.println("Deposited amount : "+amount+" \t updated balance : "+balance);
		}
	}
	
	public void withDrawAmount(int wdAmount) {
		if (wdAmount!=0) {
			balance=balance-wdAmount;
			System.out.println();
			System.out.println("Withdrawl happens Successfully");
			System.out.println("WithDrawal amount : "+wdAmount+" \t updated balance : " +balance);
		}
	}
	
	public void transfer(int trfAmount) {
		if(trfAmount<=balance) {
			balance=balance-trfAmount;
			System.out.println();
			System.out.println("Transaction happens Successfully");
			System.out.println("Transfer amount : "+trfAmount+" \t updated balance : "+balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	public void exit() {
		System.out.println("Thank you for using banking application");
		System.exit(0);
	}
	
	public void ShowMenu() {
		int option =0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Banking application");
		System.out.println();
		
		System.out.println("1 : Check Your Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Transfer");
		System.out.println("5 : Exit The System");
		
		do {
			System.out.println("");
			System.out.println("**** PLEASE SELECT A OPTION ****");
			System.out.println();
			option = scanner.nextInt();
			System.out.println("\n");
			
			switch (option) {
			case 1: 
				checkBalance();
				break;
			
			case 2: 
				System.out.println("Enter Amount to be deposited");
				int amount=scanner.nextInt();
				deposit(amount);
				break;
				
			case 3: 
				System.out.println("Enter Amount which you want to wuthdrawl");
				int wdrAmount=scanner.nextInt();
				withDrawAmount(wdrAmount);
				break;
			
			case 4: 
				System.out.println("Enter Amount which you want to transfer");
				int trfAmount=scanner.nextInt();
				transfer(trfAmount);
				break;
				
			case 5:
				exit();
				break;
				
			default:
				System.out.println("Invalid option !!! Please  enter correct Option ");
				break;
			}
				
		} while (option!=5);
				System.out.println("Thank you for using this application");
		scanner.close();		
	}
}
