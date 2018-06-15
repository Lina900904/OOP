package domain;

public class Salary {
	public static final String DEPT = "인턴쉽";
	protected String dept;
	String name;
	protected int sal;

	public Salary(String name, int sal) {
		setDept(DEPT);
		this.name = name.substring(0, 1);
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return String.format(" %s\n %s%s\n %d원 지급", DEPT, getName(), DEPT, getSal());
	}

}
