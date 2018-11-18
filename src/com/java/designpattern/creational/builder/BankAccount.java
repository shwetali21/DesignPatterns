package com.java.designpattern.creational.builder;

public class BankAccount {
	
	//required params.
	private String name;
	private String accountNumber;
	
	//optionals params
	private String email;
	private boolean newsletter;

	// Note the private visibility of the constructor, and the builder variable type.
	private BankAccount(BankAccountBuilder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsletter = builder.newsletter;
	}

	//the builder inner class
	public static class BankAccountBuilder {
		
		//required params.
		private String name;
		private String accountNumber;
		
		//optionals params
		private String email;
		private boolean newsletter;

		public BankAccountBuilder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		public BankAccountBuilder wantNewsletter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		// The build function.
		public BankAccount build() {
			return new BankAccount(this);
		}
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsletter="
				+ newsletter + "]";
	}




	public static void main(String[] args) {
		BankAccount newAccount = new BankAccount.BankAccountBuilder("Jon", "22738022275")
				//.withEmail("jon@example.com")
				//.wantNewsletter(true)
				.build();
		System.out.println(newAccount);
	}
}
