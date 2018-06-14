package domain;

public class MinusAccount extends Account{
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금
	
	public void setAccountType() {
		super.accountType= "마이너스통장";
	}
 //오버라이딩시 부모와 자식이 달라도 get을 다시 써줄 필요는 없음
	
	
	public String toString() {
		return String.format("%s\n %s\n 계좌번호:%s\n 이름:%s\n 생성일:%s\n 잔액: %d원\n",
				BANK_NAME,super.getAccountType(),super.getAccountNo(),super.getName(),super.getCreateDate(),super.getMoney());
	}
}
