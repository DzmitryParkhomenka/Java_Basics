package by.exercices.dzmitry.parkhomenka.les04_2.ex1;

public class Student {
	private int id;
	private int phoneNumber;
	private int course;
	private String surname;
	private String name;
	private String patron;
	private String birthDate;
	private String address;
	private String faculty;

	public Student() {
		id = 0;
		phoneNumber = 0;
		course = 0;
		surname = "";
		name = "";
		patron = "";
		birthDate = "";
		address = "";
		faculty = "";
	}

	public Student(int _id, int _phoneNumber, int _course, String _surname, String _name, String _patron,
			String _birthDate, String _address, String _faculty) {
		id = _id;
		phoneNumber = _phoneNumber;
		course = _course;
		surname = _surname;
		name = _name;
		patron = _patron;
		birthDate = _birthDate;
		address = _address;
		faculty = _faculty;
	}

	@Override
	public String toString() {
		return "Id - " + this.id + "\nPhone - " + this.phoneNumber + "\nCourse - " + this.course + "\nSurname - "
				+ this.surname + "\nName - " + this.name + "\nPatron - " + this.patron + "\nDate of birth - "
				+ this.birthDate + "\nAddress - " + this.address + "\nFaculty - " + this.faculty;
	}
	
	public void show(Student std) {
		System.out.println(std.toString());
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public int getId() {
		return id;
	}

	public void setPhoneNumber(int _phoneNumber) {
		this.phoneNumber = _phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setCourse(int _course) {
		this.course = _course;
	}

	public int getCourse() {
		return course;
	}

	public void setSurname(String _surname) {
		this.surname = _surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public void setPatron(String _patron) {
		this.patron = _patron;
	}

	public String getPatron() {
		return patron;
	}

	public void setBirthDate(String _birthDate) {
		this.birthDate = _birthDate;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setAddress(String _address) {
		this.address = _address;
	}

	public String getAddress() {
		return address;
	}

	public void setFaculty(String _faculty) {
		this.faculty = _faculty;
	}

	public String getFaculty() {
		return faculty;
	}

}
