package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
/*
 * 얼마를 구입하십니까?
 * 5200
 * 5 7  14 25 29 43
 * 3 24 33 37 39 43
 * 
 */

enum Butt {
	EXIT, INPUT_BMI, OUTPUT_BMI, INPUT_GRADE, OUTPUT_GRADE, INPUT_SALARY, OUTPUT_SALARY, INPUT_LOTTO, OUTPUT_LOTTO, INTPUT_NUM, INPUT_NAME, INPUT_CALL, TELEPHONE;
}

public class Main {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.INPUT_BMI, Butt.OUTPUT_BMI, Butt.INPUT_GRADE, Butt.OUTPUT_GRADE,
				Butt.INPUT_SALARY, Butt.OUTPUT_SALARY, Butt.INPUT_LOTTO, Butt.OUTPUT_LOTTO };

		BMI[] arr = new BMI[3];
		BMI bmi = null;
		int count = 0;

		Grade[] arr1 = new Grade[3];
		Grade grade = null;
		int cn = 0;

		Salary[] arr2 = new Salary[3];
		Salary salary = null;
		int c = 0;

		Lotto[] arr3 = new Lotto[6];
		int[][] mtx = new int[5][6];
		Lotto lotto = null;
		int cc = 0;
		int r = 0;

		while (true) {
			switch ((Butt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU", JOptionPane.QUESTION_MESSAGE,
					null, buttons, null)) {
			case EXIT:
				return;
			case INPUT_BMI:
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				bmi.setResult();
				arr[count] = bmi;
				count++; // 1씩 증가하여 위 count에 반영됨, ex) arr[0]에 이름, arr[1]에 키
				break;
			case OUTPUT_BMI:
				String output = "";
				for (int i = 0; i < arr.length; i++) {
					output += arr[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;

			case INPUT_GRADE:
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				arr1[cn] = grade;
				cn++;
				break;
			case OUTPUT_GRADE:
				output = "";
				for (int i = 0; i < cn; i++) {
					output += arr1[i].toString() + "\n";

				}
				JOptionPane.showMessageDialog(null, output);
				break;

			case INPUT_SALARY:
				salary = new Salary();
				salary.setDept(JOptionPane.showInputDialog("부서"));
				salary.setName(JOptionPane.showInputDialog("이름"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당")));
				salary.setTotal();
				arr2[c] = salary;
				c++;
				break;
			case OUTPUT_SALARY:
				output = "";
				for (int i = 0; i < c; i++) {
					output += arr2[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output);
				break;

			case INPUT_LOTTO:
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 구입하실건가요?")));
				lotto.setBall();
				arr3[cc] = lotto;
				cc++;
				break;
			case OUTPUT_LOTTO:
				output = "";
				for (int i = 0; i < cc; i++) {
					output += arr3[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, output);


				break;

			default:

				return;
			}

		}
	}
}
