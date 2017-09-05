/*************************************************
 * Super Class인 Calculator는 CalculatorDemo1에 있다.
 * 따라서 여기에서는 따로 정의하지 않는다.
 * 따로 정의하면 Error 떨어짐
 *************************************************/
package egoing.opentutorials;

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }
 
}