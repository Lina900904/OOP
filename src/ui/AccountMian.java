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
		EXIT, ACCOUNT, MINUSACCOUNT, DEPOSIT, WITHDRAW;
	}

	private static MinusAccount accout;
	private static int money;

	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.EXIT,AccountButt.ACCOUNT,AccountButt.MINUSACCOUNT,
				AccountButt.DEPOSIT, AccountButt.WITHDRAW};

		Account account = null;
		MinusAccount minusaccount = null;
		while (true) {
			switch ((AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
			case EXIT:
				return;
			case ACCOUNT:
				account = new Account(
						JOptionPane.showInputDialog("Name"),
						JOptionPane.showInputDialog("User ID"),
						JOptionPane.showInputDialog("Password")
						);
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Money")));
				JOptionPane.showMessageDialog(null,account.toString());
				break;
			case MINUSACCOUNT:
				account = new MinusAccount(
						JOptionPane.showInputDialog("Name"),
						JOptionPane.showInputDialog("User ID"),
						JOptionPane.showInputDialog("Password")
						);
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출한도")));
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 대출받으실래요")));
				JOptionPane.showMessageDialog(null,account.toString());
				break;
			case DEPOSIT:
			
				JOptionPane.showMessageDialog(null,"잔액:"+account.getMoney());
				account.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("입금 금액")));
				JOptionPane.showMessageDialog(null,account.toString());
				
				break;
				
			case WITHDRAW:
				JOptionPane.showMessageDialog(null,"잔액:"+account.getMoney());
				if(((MinusAccount)account).getLimit()!=0) {
					Integer.parseInt(JOptionPane.showInputDialog("출금 금액"));
					if (money>((MinusAccount) accout).getLimit()) {
						JOptionPane.showMessageDialog(null, "출금성공");
					}else {
						JOptionPane.showMessageDialog(null, "출금불가능");
					}
				}else {
					if(money>((MinusAccount) accout).getLimit()) {
						JOptionPane.showMessageDialog(null, "출금성공");
					}else {
						JOptionPane.showMessageDialog(null, "출금불가능");
					}
				}
				
				
				JOptionPane.showMessageDialog(null,account.toString());	
			
				break;
			default : return;
			
			}
			
		
		


		}

	}
}
	


