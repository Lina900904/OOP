package ui;

import javax.swing.JOptionPane;

import domain.CellPhone;
import domain.Phone;
import domain.IPhone;
import domain.GalaxyPhone;


enum PhoneButt {
	EXIT, TELEPHONE, CELLPHONE,IPhone,GalaxyPhone;
}

public class PhoneMain {
//버튼 0.통화종료 1. 집전화기
	
	
	public static void main(String[] args) {
		PhoneButt[] buttons = { PhoneButt.EXIT, PhoneButt.TELEPHONE,PhoneButt.CELLPHONE,PhoneButt.IPhone,PhoneButt.GalaxyPhone
				};

		Phone phone = null;
		 CellPhone cp = null;
		IPhone ip =null;
		GalaxyPhone gp =null;
		while(true) {
			switch ((PhoneButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU", JOptionPane.QUESTION_MESSAGE,
					null, buttons, null)) {
			case EXIT: return;
			case TELEPHONE :
				phone=new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setphoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE :
				cp=new CellPhone();
				
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setphoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPhone :
				ip=new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setphoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setDate(JOptionPane.showInputDialog("무엇을"));
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GalaxyPhone :
				gp=new GalaxyPhone();
				gp.setName(JOptionPane.showInputDialog("이름"));
				gp.setphoneNum(JOptionPane.showInputDialog("전화번호"));
				gp.setData(JOptionPane.showInputDialog("무엇을"));
				gp.setSize(); //입력값을 받지 않고 고정 시켜도 한줄 써야함
				JOptionPane.showMessageDialog(null, gp.toString());
				break;
				
				
				
				
				
			default :break;
			}
			
		}
	}
}
