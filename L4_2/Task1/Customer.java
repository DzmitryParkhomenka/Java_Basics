package by.exercices.dzmitry.parkhomenka.les04_2.ex1;

public class Customer {
	private int id;
	private String cardNumber;
	private String bankNumber;
	private String surname;
	private String name;
	private String patron;
	private String address;


	public Customer() {
		id = 0;
		cardNumber = "";
		bankNumber = "";
		surname = "";
		name = "";
		patron = "";
		address = "";
	}

	public Customer(int _id, String _cardNumber, String _bankNumber, String _surname, String _name, String _patron,
			String _address) {
		id = _id;
		cardNumber = _cardNumber;
		bankNumber = _bankNumber;
		surname = _surname;
		name = _name;
		patron = _patron;
		address = _address;
	}

	@Override
	public String toString() {
		return "Id - " + this.id + "\nCard Number - " + this.cardNumber + "\nBank Number - " + this.bankNumber + "\nSurname - "
				+ this.surname + "\nName - " + this.name + "\nPatron - " + this.patron + "\nAddress - " + this.address;
	}
	
	public void show(Customer cust) {
		System.out.println(cust.toString());
	}
	
	public void show(Student std) {
		System.out.println(std.toString());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
