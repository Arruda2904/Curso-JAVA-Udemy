package util;

public class Account {
	private String name;
	private int number;
	private double balance;
	
	public Account(String name, int number) { //para quando cria a conta sem saldo inicial
		this.name = name;
		this.number = number;
	}

	public Account(String name, int number, double initialDeposit) { //para quando cria a conta com saldo inicial
		this.name = name;
		this.number = number;
		deposit(initialDeposit);  //quando cria a conta o saldo sempre é zero,só que tem deposito inicial,dessa forma
		                          //se mudar o metodo deposit,nao precisa mudar aqui
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() { //nao tem set number pq ele nao pode mudar
		return number;
	}

	public double getBalance() { //nao tem setbalance pq ele nao pode mudar,so somar e subtrair
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount + 5.0; //tem taxa de saque de 5 reais
	}

	public String toString() {
		return "Account " + number+ ",Holder:" + name + ", Balance: $" + String.format("%.2f",balance);
	}
	
	
	
	
	

}

