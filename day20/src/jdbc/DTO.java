package jdbc;

public class DTO {	// Data Transfer Object, DB <-> Program 사이로 데이터를 주고받기 위해 사용하는 객체
	private String fisrtName;
	private int salary;
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
