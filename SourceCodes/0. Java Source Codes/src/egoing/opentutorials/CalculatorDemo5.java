/****************************************************
* 
* Multi exception check using try-catch statements
* For the test input 2 numbers
* 
* Normal Output : Qucient(first/second)
* 
* ��� �߰� : �����ڰ� ���� �����޽����� throw�� �̿��Ͽ� try/catch �������� ������ �����, ���α׷� Crash�� ���ϴ� ����� ó�����
*          �����ϰ� �ٽ� Ȯ���� ��
*          Updated - SomeClass�� main()�� �л�Ǿ� �ִ� Exceptionó�� ����
*                    Input ���� �������� Check�� 
* �߰� ���� : While loop�� ��� �Է� ���� �� �ְ� ����. 
* 
* 2017. 8. 26   made by : Aris Kim
*/
package egoing.opentutorials;
import java.util.Scanner;

class SomeClass2{
   boolean error_occurred = false;
   private int[] arr = new int[5];
   SomeClass2(){
       for(int i = 0; i < 5; i++) {
    	   arr[i] = i;
       }
   }

   public void divide(int first, int second){
   	 try {
            System.out.println("������ ���(�� ������) : " + arr[first] + " / " + arr[second] + " = " + (arr[first] / arr[second]) + "�Դϴ�.");
     } catch(ArrayIndexOutOfBoundsException e){
  	      error_occurred = true;
  	      //throw new ArrayIndexOutOfBoundsException("����� Array�� ������ ������ϴ�. 0�� " + (arr.length -1) + " ������ ���� �Է��ϼ���.");  // ������ �ۼ�(Customized) Error message
     	  System.out.println("����� Array�� ������ ������ϴ�. 0�� " + (arr.length -1) + " ������ ���� �Է��ϼ���. : " +e.getMessage());
     } catch(ArithmeticException e){
  	      error_occurred = true;
  	      //throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");  // ������ �ۼ�(Customized) Error message
  	      System.out.println("0���� ������ ���� ������ �ʽ��ϴ�. : "+e.getMessage());  
     } catch(Exception e){
       	  error_occurred = true;
          System.out.println("������ �߻��߽��ϴ�. Exception message : "+e.getMessage());
     } finally {
        if (error_occurred) {
   		   /*
   		    * finally�� Database ���� �۾�, File open �۾� ��� ���� ���ο� ������� �ݵ�� ������ ���ų� 
   		    * file open�� �����ؾ� �ϴ� ��� ����ϰ� ���� �� �ִ�.
   		    * finally�� Error(Exception) ������ ������� �ݵ�� �����. 
   		    * �׷��� ���� �߻��� ��쿡�� ��ɹ��� ó���ϴ� Logic�� ������ 
   		    */
     	   System.out.println("���� �޽��� ��� �Ŀ��� �̷��� Finally statement�� ����˴ϴ�!\n");
    	   //System.out.println("������ �߻����� ���� ��쿣 �� �޽����� �������� ���� �ſ�.\n");	
    	   error_occurred = false;   // error_occurred initialization
       }															  		 
     }
   }
}


public class CalculatorDemo5 {
   public static void main(String[] args) {
	   boolean error_occurred = false;
	   int myIntVar1, myIntVar2;
       SomeClass2 sc = new SomeClass2();
       
       System.out.println("Please input two integers seperately.");
       Scanner myVar1 = new Scanner(System.in);
       Scanner myVar2 = new Scanner(System.in);
       
       try {
    	   myIntVar1 = myVar1.nextInt();
    	   myIntVar2 = myVar2.nextInt();
    	   
    	   sc.divide(myIntVar1, myIntVar2);    	   
       } catch(Exception e){
    	   System.out.println("0�� 4 ������ ������ ���� �Է��� �ּ���.");
       }
       
       /*
        * �Ʒ��� �ż��� �׽�Ʈ�� ���� �ڵ� 
    	* (1) Array IndexOutofBounds Exception + finally + Error �� ���α׷� ���� ���� Test
    	* (2) Arithmetic Exception(Divide by zero) + finally + Error �� ���α׷� ���� ���� Test
    	* (3) Array IndexOutofBounds Exception(���ڷ� ���� ���� : Array index check ���� Ȯ��)
    	* (4) ��Ÿ Exception �߻����� Test -> �� ����ڴ�.
    	* (5), (6) ���� ���
    	*/ 
           sc.divide(10, 2); 		
           sc.divide(2, 0);		
    	   sc.divide(-3, 2);
    	   sc.divide(2, 2019);		// Array���� unchecked�� ��Ÿ ������ ��� ���� �� ������? 
           sc.divide(4, 2);
           sc.divide(3, 2); 
   }
}