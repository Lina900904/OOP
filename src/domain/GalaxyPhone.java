package domain;

public class GalaxyPhone extends IPhone{
	private String size;
	protected String data;
	// 홍길동에게 010 번호로 삼성 제품 6인치 갤럭시노트폰을 
	//사용해서 이동가능한 상태로 안녕이라고 카톡했다.
	//데이터를 오버라이딩(안녕이라고 카톡했다.)
	
	private static final String BRAND ="삼성",KIND = "갤럭시노트";
	public void setData(String data) {
		super.data=data +"라고 카톡 했다";
	}
	
	public void setSize() {//입력받지 않을 경우만()안에 채움
		
		size="6인치";
	}
	
	public String getSize() {
		return size;
	}
	public String getData() {
		return data;
	}
	public String toString() {
		super.setPortable(true);
		return String.format("%s에게 %s 번호로 %s 제품 %s %s을\n" 
				+"사용해서 %s 상태로 %s", 
				super.getName(),super.getphoneNum(),BRAND,size,KIND,super.getMove(),super.getData());
	}
}
