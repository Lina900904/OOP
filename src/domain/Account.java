package domain;

import java.text.*;
import java.util.*;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money,deposit,withdraw;
	protected String uid, name, pass, accountType, createDate, accountNo;

	public Account(String name, String uid, String pass) {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
		this.name = name;
		this.uid=uid;
		this.pass=pass;
	}

	public void setDeposit(int deposit) {
		int total = 0;
		money = money + deposit;
		this.deposit=money;
	}
	public void setWithdraw(int withdraw) {
		int total  = 0;
		money =money-withdraw;
		this.withdraw = money; 
	}
	
	public void setMoney( int money) {

		this.money += money;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCreateDate() {
		this.createDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	public void setAccountNo() {
		String accountNum = "";
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				accountNum += String.format("%03d", (int) (Math.random() * 1000)) + " ";
			} else {
				accountNum += String.format("%03d", (int) (Math.random() * 1000)) + "-";
			}
		}
		this.accountNo = accountNum;

	}

	public int getMoney() {
		return money;
	}

	public String getName() {
		return name;
	}


	public String getPass() {
		return pass;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String toString() {
		return String.format("%s\n %s\n 계좌번호:%s\n 이름:%s\n 생성일:%s\n 잔액: %d원 \n", BANK_NAME, ACCOUNT_TYPE, getAccountNo(),
				getName(), getCreateDate(),getMoney());
	}

}
