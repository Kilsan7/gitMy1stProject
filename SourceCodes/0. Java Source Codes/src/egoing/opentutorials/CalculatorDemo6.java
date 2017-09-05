/****************************************************
* 
* egoing Java : Object Class 수업 동영상 중 2/5
* Subject : Object Class의 toString() 오버라이딩
*           (Ruby : Sololearn -> OOP -> The to_s Method 내용과 동일한 내용임. Ruby처럼 Java도 제공함)
* 참고사항 : Object Class 수업 동영상 중 3/5에는 equals method overriding하는 유용한 방법이 자세하게 설명된다.
* 
* Normal Output : Customized toString Method
* 
* 2017. 8. 27   made by : Aris Kim
*/
package egoing.opentutorials;

class Calculator6 {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left/this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	// toString method overriding
	public String toString() {
        return "super.toString() 저장 정보 : " + super.toString() + ", 계산할 입력값 left : " + this.left + ", right : " + this.right + "입니다.";
    }
}
public class CalculatorDemo6 {

	public static void main(String[] args) {
		Calculator6 c1 = new Calculator6();
		c1.setOperands(10, 20);
		
		System.out.println(c1);
		System.out.println(c1.toString());     // object를 인자로 전달하면 default로 toSting()이 실행되므로 위 라인과 결과는 동일하다.
		
	}

}
