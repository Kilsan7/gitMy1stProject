/*****************************************************
*
* egoing Example : Variable의 유효범위 Test
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
	        
	        /* 인스턴스에 속하지 않는 Class member(static)는 모든 인스턴스에서 같은 값으로 활용가능하다.*/
	        System.out.println(c1.PI);
	 
	        System.out.println(c2.PI);
	 
	        System.out.println(Calculator.PI);  //이렇게 Class.member명으로도 접근 가능
	    }
}
