/*****************************************************
*
* egoing Example : Variable�� ��ȿ���� Test
* 
* 2017. 8. 9
*
******************************************************/
package egoing.opentutorials;

class Calculator{
	static double PI = 3.14;
	int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

public class CalculatorDemo {

	    public static void main(String[] args) {
	          
	        Calculator c1 = new Calculator();
	        c1.setOprands(10, 20);
	        c1.sum();       
	        c1.avg();       
	          
	        Calculator c2 = new Calculator();
	        c2.setOprands(20, 40);
	        c2.sum();       
	        c2.avg();
	        
	        /* �ν��Ͻ��� ������ �ʴ� Class member(static)�� ��� �ν��Ͻ����� ���� ������ Ȱ�밡���ϴ�.*/
	        System.out.println(c1.PI);
	 
	        System.out.println(c2.PI);
	 
	        System.out.println(Calculator.PI);  //�̷��� Class.member�����ε� ���� ����
	    }
}
