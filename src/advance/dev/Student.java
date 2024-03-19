package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;

	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageScore = averageScore;
	}

	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + ", phoneNumber='"
				+ phoneNumber + '\'' + ", averageScore=" + averageScore + '}';
	}
}
