package ui;

import javax.swing.JOptionPane;

import domain.Salary;
import domain.StaffSalary;
import domain.OwnerSalary;
enum SalaryButt {
	EXIT, INTERN, STAFF, OWNER
};
// 인스턴스 한개만,단 상속에서만 가능
//생성자에 부서, 이름 sal을 반드시 받아야 객체가 생성되도록
// 직원이 오면 인턴, 사원, 이사진 선택, 이름 급여 입력, 보너스 나오게
// 이름 , 금액넣으면 => 김인턴 100만원 지급
// 김길동,100 => 김직원 => 110원 지급
// 김길동,100 => 김이사 1100만원 지급

public class SalaryMain {

	public static void main(String[] args) {
		SalaryButt[] buttons = { SalaryButt.EXIT, SalaryButt.INTERN, SalaryButt.STAFF, SalaryButt.OWNER };

		String salary = null;
		while (true) {
			switch ((SalaryButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
			case EXIT:
				return;
			case INTERN:
	
				JOptionPane.showMessageDialog(null,
						salary= new Salary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						).toString());
				break;

			case STAFF:
				
				JOptionPane.showMessageDialog(null,
						salary= new StaffSalary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						).toString());
				break;
				
	case OWNER:
				
				JOptionPane.showMessageDialog(null,
						salary= new OwnerSalary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						).toString());
				break;
			default:
				break;

			}
		}
	}
}
