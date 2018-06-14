package domain;

import javax.swing.JOptionPane;

/*
 * 로또볼 추첨
 * 1~45까지 랜덤숫자
 * 볼갯수는 총 6개
 * 
 * 출력은 [5,23,24,40,19,22]
 */
public class Lotto {
	int ball, money;
	int result;
	int i = 0;
	int[] num = new int[6];
	int[][] mtx = new int[5][6];

	public void setBall() {
		for (int i = 0; i < 6; i++) {
			this.ball = (int) (Math.random() * 45);
			num[i] = ball;

		}
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setResult() {
		for (int i = 0; i < money / 1000; i++) {
			for (int j = 0; j < 6; j++) {
				j++;
				result += mtx[i][num[j]];
			}
			
		}
		result += Integer.parseInt("\n");

	}

	public int getResult() {

		return result;
	}

	public int getBall() {
		return ball;
	}

	public int getMoney() {
		return money;
	}

	public String toString() {
		return String.format("%d %d %d %d %d %d",result);

	}

}
