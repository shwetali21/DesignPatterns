package com.java.designpattern.behavioral.chainofresponsibility;

import java.util.Scanner;

/**ATM Dispenser implementation to process the user requested amount*/
public class ATMDispenseChain {

	private DispenseChain dispense50;

	public ATMDispenseChain() {

		// initialize the chain
		this.dispense50 = new Dollar50Dispenser();
		DispenseChain dispense20 = new Dollar20Dispenser();
		DispenseChain dispence10 = new Dollar10Dispenser();

		// set the chain of responsibility
		dispense50.setNextChain(dispense20);
		dispense20.setNextChain(dispence10);
	}


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();

		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense: ");

			Scanner input = new Scanner(System.in);
			amount = input.nextInt();

			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}

			// process the request
			atmDispenser.dispense50.dispense(new Currency(amount));

			input.close();
			System.exit(0);
		}
	}
}
