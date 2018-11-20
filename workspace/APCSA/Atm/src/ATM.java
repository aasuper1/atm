import java.util.Scanner;
public class ATM {
	private  BankAccount account;
	private  Scanner input;
	public static void main(String[] args) {
		
		ATM myATM = new ATM(new BankAccount(300, 12345, 1234, new AccountHolder()));
		myATM.startATM();
	}
	
	
	public ATM(BankAccount _account) {
		account = _account;
	}
	
	public void startATM() {
		input = new Scanner(System.in);
		System.out.println("Enter your account number:");
		long accountNumber = input.nextLong();
		System.out.println("Enter your PIN");
		long pin = input.nextLong();
		input.nextLine();
		if (accountNumber == account.getAccountNumber() && pin == account.getPin()) {
			String option;
			do {
				System.out.println("To withdraw: type '1'. \nTo deposit: type '2'. \nTo show balance: type '3'. \nTo exit: type '0'");
				option = input.nextLine();
				if (Integer.parseInt(option) == 1) {
					System.out.println("How much do you want to withdraw. Enter the value in dollars.");
					double request = input.nextDouble();
					input.nextLine();
					if (request > 0 && request <= account.getBalance()) {
						account.setBalance(account.getBalance() - request);
					}else if (request <= 0) {
						System.out.println("Enter a value above 0");
					}else if (request > account.getBalance()) {
						System.out.println("You do not have enough money . . . get working.");
					}
				}
				if (Integer.parseInt(option) == 2) {
					System.out.println("How much do you want to deposit");
					double deposit = input.nextDouble();
					input.nextLine();
					if (deposit > 0) {
						account.setBalance(account.getBalance() + deposit);
					}else if (deposit <= 0) {
						System.out.println("Enter a value above 0");
					}
				}
				if (Integer.parseInt(option) == 3) {
					System.out.println("Your balance is " + account.getBalance());
				}
			} while (Integer.parseInt(option) != 0);
			
		} else {
			System.out.println("Access denied wrong account number or pin.");
		}
		

	}
	
	public void setAccount(BankAccount _account) {
		account = _account;
	}
	
	public BankAccount getAccount(){
		return account;
	}
	
	public void checkBalance() {
		
	}
}
