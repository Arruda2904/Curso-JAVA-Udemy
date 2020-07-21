package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployees;

	public Company(String name, Double anualIncome, Integer numberOfExmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfExmployees;
	}
	
	public Company() {
	}

	public Integer getNumberOfExmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfExmployees(Integer numberOfExmployees) {
		this.numberOfEmployees = numberOfExmployees;
	}

	@Override
	public Double tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}
}
