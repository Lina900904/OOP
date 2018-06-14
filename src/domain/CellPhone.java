package domain;

public class CellPhone extends Phone { // extends는 상속
	public static final String BRAND = "노키아", KIND = "휴대폰";
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
	/*	if (portable) {
			setMove("이동 가능");
		} else {
			setMove("이동 불가능");
		}*/
		setMove((portable)?"이동 가능":"이동 불가능");
		this.portable= portable;
	}
	public void setMove(String move) {
		this.move = move;
	}

	public boolean isPortable() { // boolean타입은 is
		return portable;
	}

	public String getMove() {
		return move;
	}

	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로 %s 제품 전화기를 사용해서 %s를 사용해서 %s라고 통화했다.", 
				super.getName(), super.getphoneNum(),move,
				BRAND, KIND, super.getCall()); // 상수static값은 대문자로
	}

}
