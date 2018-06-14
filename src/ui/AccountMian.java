package ui;

import javax.swing.JOptionPane;

import domain.Account;
import domain.MinusAccount;
/*비트뱅크
기본통장
계좌번호 123-456-789
이름 : 홍길동
생성일 : 2018월 6월 10일
잔액 : 10000원
---------------
비트뱅크
마이너스 통장
계좌번호 123-456-789
이름 : 홍길동
생성일 : 2018월 6월 10일
이름 : 홍길동
잔액 : -10000원*/
public class AccountMian {

	enum AccountButt {
		EXIT, ACCOUNT, MINUSACCOUNT;
	}

	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.EXIT,AccountButt.ACCOUNT,AccountButt.MINUSACCOUNT };

		Account account = null;
		MinusAccount minusaccount = null;
		while (true) {
			switch ((AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
			case EXIT:
				return;
			case ACCOUNT:
				account = new Account();
				account.setName(JOptionPane.showInputDialog("Name"));
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Money")));
				account.setUid(JOptionPane.showInputDialog("User ID"));
				account.setPass(JOptionPane.showInputDialog("Password"));
				account.setAccountType();
				account.setAccountNo();
				account.setCreateDate();
				JOptionPane.showMessageDialog(null,account.toString());
				break;
			case MINUSACCOUNT:
				minusaccount = new MinusAccount();
				minusaccount.setName(JOptionPane.showInputDialog("Name"));
				minusaccount.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Money")));
				minusaccount.setUid(JOptionPane.showInputDialog("User ID"));
				minusaccount.setPass(JOptionPane.showInputDialog("Password"));
				minusaccount.setAccountType();
				minusaccount.setAccountNo();
				minusaccount.setCreateDate();
				JOptionPane.showMessageDialog(null,minusaccount.toString());
				break;

			}
		}
	}
}
