package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE = "마이너스통장";
	public int debt, limit; // 대출금,대출한도

	public MinusAccount(String name, String uid, String pass) {
		super(name, uid, pass);
		setAccountType(ACCOUNT_TYPE);
	}
	
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}

	public String toString() {
		return String.format("%s\n %s\n 계좌번호:%s\n 이름:%s\n 생성일:%s\n 잔액: %d원\n",
				BANK_NAME,super.getAccountType(),super.getAccountNo(),super.getName(),super.getCreateDate(),super.getMoney());
	}


}

