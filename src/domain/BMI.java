package domain;

public class BMI {
	String name, result = "";
	double height, weight;

	// 세터 입력받는 부분
	public void setName(String name) {
		this.name = name; //
	}

	public void setResult() {
		double bmi = (weight / ((height*height)/10000));
		
		 if(bmi>=18.5 && bmi<23.0){
	 			result = "정상";
	 		}else if(bmi>=23.0 && bmi<25.0){
	 			result = "비만 전단계";
	 		}else if(bmi>=25.0 && bmi<30.0){
	 			result = "비만";
	 		}else if(bmi>=30.0 && bmi<35.0){
	 			result = "1단계 비만";
	 		}else if(bmi<18.5){
	 			result = "저체중";
		
	 		}else{
	 			result = "3단계 비만";
	 		}
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 출력부분
	public String getName() {
		return name; //이부분도 this.name 가능, 생략가능
	}

	public String getResult() {
		return result;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;

	}
	public String toString() {
		return String.format ("| %s  | %f  |  %f  |  %s",name,height,weight);
	}

}
