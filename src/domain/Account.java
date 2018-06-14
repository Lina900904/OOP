package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String uid,name,pass,accountType,createDate,accountNo;
	
	
	public void setMoney(int money) {
		this.money= money;
	}
	public void setUid(String uid) {
		this.uid= uid;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setPass(String pass) {
		this.pass= pass;
	}
	public void setAccountType() {
		accountType= "기본통장";
	}
	public void setCreateDate() {
		Date now=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		this.createDate= df.format(now);
	}
	public void setAccountNo() {
		int num=0;
		String result = "";
		for(int i=0;i<3;i++) {
			if(i==2) {
				num=(int)(Math.random()*1000);
				result += num+" ";
			}else {
				num=(int)(Math.random()*1000);
				result += num+"-" ;
			}
		}
		accountNo= result; 
	
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
		return String.format("%s\n %s\n 계좌번호:%s\n 이름:%s\n 생성일:%s\n 잔액: %d원\n",
				BANK_NAME,ACCOUNT_TYPE,getAccountNo(),getName(),getCreateDate(),getMoney());
	}
	
}
