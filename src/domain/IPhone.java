package domain;

public class IPhone extends CellPhone{
	// 홍길동에게 010 번호로애플 제품 아이폰을 사용해서 
	//  이동가능한 상태로 안녕이라고 문자를 전송했다.
	protected String data;
	private static final String BRAND ="애플",KIND = "아이폰";
	
	public void setDate(String data) {
		this.data= data;
	}
	public String getData() {
		return data;
	}

	public String toString() {
		super.setPortable(true);
		return String.format(
				"%s에게 %s 번호로 %s %s 제품 %s을 사용해서\n"+
					" %s이라고 문자를 전송했다.",
				super.getName(), super.getphoneNum(),
				super.getMove(),BRAND, KIND, getData());
	}
}
