package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(10001, "Ricardo", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Larissa", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 =  bacc;
		
		Account acc2 = new BusinessAccount(1003, "Emanuelly", 0.0, 200.0);
		
		Account acc3 = new SavingsAccount(1004, "Gabi", 0.0, 0.01);
		
		//DOWNCASTING
		
	BusinessAccount acc4 =  (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		
		///BusinessAccount acc5 = (BusinessAccount)acc3; não posso instancia um objeto do tipo BusinessAccount 
		
		// como regra utilizamos a função instanceof para verifica se é possível 
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			
			acc5.loan(200.0);
			
			System.out.println("Loan!");
		}
		// Verdadeiro acc3 e instancia de SavingsAccount
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("UPdate ");
		}
	}

}
