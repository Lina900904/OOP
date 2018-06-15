package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT = "이사회";
	protected int share; // (sal+bonus)*10
	
	public OwnerSalary(String name, int sal) {
		super(name,sal);
		this.share=(sal+bonus)*10;
		setDept(DEPT);
	}
	public int getShare() {
		return share;
	}
	public String toString() {
		return String.format(" %s%s\n %d원 지급" ,  
				super.getName(),super.getDept(),getShare());
}
}
