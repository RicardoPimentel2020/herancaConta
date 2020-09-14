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
		// Conta Corrente o método com desconto de saque 
		Account acb =  new Account(1005, "Rick", 1000.00);
		acb.withdraw(200.0);
		System.out.println(acb.getBalance());
		
		//Conta poupança sem desconto sobreescrendo o método
		Account cbn =  new SavingsAccount(1006, "RicardoPi", 1000.0, 0.01);
		cbn.withdraw(200.0);
		System.out.println(cbn.getBalance());
		
		Account bnm = new BusinessAccount(1009, "Larissa", 1000.0, 500.00);
		bnm.withdraw(200.0);
		System.out.println(bnm.getBalance());
		
		
	}
	
	

}
