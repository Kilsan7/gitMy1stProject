/******************************************************************
 * Super Class인 MultiplicationableCalculator는 CalculatorDemo2에 있다.
 * 따라서 여기에서는 따로 정의하지 않는다.
 * 따로 정의하면 Error 떨어짐
 ******************************************************************/
package egoing.opentutorials;

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}