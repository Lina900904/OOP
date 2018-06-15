package domain;

public class StaffSalary extends Salary {
	public static final String DEPT = "정직원";
	protected int bonus; // 10프로

	public StaffSalary(String name, int sal) {
		super(name, sal);
		this.bonus = sal*10/100;
		this.sal = sal + bonus;
		setDept(DEPT);
	}
	public int getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format(" %s%s\n %d원 지급", super.getName(), super.getDept(), super.getSal());
	}
}