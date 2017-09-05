/****************************************************
* 
* egoing Java : Object Class ���� ������ �� 2/5
* Subject : Object Class�� toString() �������̵�
*           (Ruby : Sololearn -> OOP -> The to_s Method ����� ������ ������. Rubyó�� Java�� ������)
* ������� : Object Class ���� ������ �� 3/5���� equals method overriding�ϴ� ������ ����� �ڼ��ϰ� ����ȴ�.
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
        return "super.toString() ���� ���� : " + super.toString() + ", ����� �Է°� left : " + this.left + ", right : " + this.right + "�Դϴ�.";
    }
}
public class CalculatorDemo6 {

	public static void main(String[] args) {
		Calculator6 c1 = new Calculator6();
		c1.setOperands(10, 20);
		
		System.out.println(c1);
		System.out.println(c1.toString());     // object�� ���ڷ� �����ϸ� default�� toSting()�� ����ǹǷ� �� ���ΰ� ����� �����ϴ�.
		
	}

}
