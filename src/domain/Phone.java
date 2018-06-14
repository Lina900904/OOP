package domain;

public class Phone {
	private String name,phoneNum,call;
	public static final String BRAND = "삼성",KIND = "집전화기"; //static->공유시킴
	//final=상수 
	
		//홍길동, 010-1234-5678,삼성,집전화기,2시에만나
		
		public void setName(String name) {
			this.name=name;
		}
		public void setphoneNum(String phoneNum) {
			this.phoneNum=phoneNum;
		}

		
		public void setCall(String call) {
			this.call=call;
		}
		
		public String getName() {
			return name;
		}
		public String getphoneNum() {
			return phoneNum;
		}

		public String getCall() {
			return call;
		}
		
		public String toString() {
			return String.format("%s 에게 %s 번호로 %s 제품 전화기를 사용해서 %s를 사용해서 %s라고 통화했다."
					,name,phoneNum,BRAND,KIND,call); //상수static값은 대문자로
	}



	
	
	
}
