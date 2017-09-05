/****************************************************
* 
* Multi exception check using try-catch statements
* For the test input 2 numbers
* 
* Normal Output : Qucient(first/second)
* 
* 기능 추가 : 개발자가 만든 에러메시지를 throw를 이용하여 try/catch 구문으로 보내서 출력함, 프로그램 Crash도 피하는 우아한 처리방식
*          정밀하게 다시 확인할 것
*          Updated - SomeClass와 main()에 분산되어 있던 Exception처리 통합
*                    Input 값이 정수인지 Check함 
* 추가 과제 : While loop로 계속 입력 받을 수 있게 하자. 
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
            System.out.println("나눗셈 결과(몫만 정수로) : " + arr[first] + " / " + arr[second] + " = " + (arr[first] / arr[second]) + "입니다.");
     } catch(ArrayIndexOutOfBoundsException e){
  	      error_occurred = true;
  	      //throw new ArrayIndexOutOfBoundsException("저장된 Array의 범위를 벗어났습니다. 0과 " + (arr.length -1) + " 사이의 값을 입력하세요.");  // 개발자 작성(Customized) Error message
     	  System.out.println("저장된 Array의 범위를 벗어났습니다. 0과 " + (arr.length -1) + " 사이의 값을 입력하세요. : " +e.getMessage());
     } catch(ArithmeticException e){
  	      error_occurred = true;
  	      //throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");  // 개발자 작성(Customized) Error message
  	      System.out.println("0으로 나누는 것은 허용되지 않습니다. : "+e.getMessage());  
     } catch(Exception e){
       	  error_occurred = true;
          System.out.println("에러가 발생했습니다. Exception message : "+e.getMessage());
     } finally {
        if (error_occurred) {
   		   /*
   		    * finally는 Database 접속 작업, File open 작업 등에서 에러 여부와 관계없이 반드시 접속을 끊거나 
   		    * file open을 종료해야 하는 경우 요긴하게 쓰일 수 있다.
   		    * finally는 Error(Exception) 유무와 관계없이 반드시 실행됨. 
   		    * 그래서 에러 발생한 경우에만 명령문을 처리하는 Logic을 가미함 
   		    */
     	   System.out.println("에러 메시지 출력 후에도 이렇게 Finally statement는 실행됩니다!\n");
    	   //System.out.println("에러가 발생하지 않은 경우엔 이 메시지를 보여주지 않을 거요.\n");	
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
    	   System.out.println("0과 4 사이의 정수를 각각 입력해 주세요.");
       }
       
       /*
        * 아래는 신속한 테스트를 위한 코드 
    	* (1) Array IndexOutofBounds Exception + finally + Error 후 프로그램 정상 실행 Test
    	* (2) Arithmetic Exception(Divide by zero) + finally + Error 후 프로그램 정상 실행 Test
    	* (3) Array IndexOutofBounds Exception(인자로 음수 보냄 : Array index check 여부 확인)
    	* (4) 기타 Exception 발생조건 Test -> 못 만들겠다.
    	* (5), (6) 정상 출력
    	*/ 
           sc.divide(10, 2); 		
           sc.divide(2, 0);		
    	   sc.divide(-3, 2);
    	   sc.divide(2, 2019);		// Array에서 unchecked로 기타 에러는 어떻게 만들 수 있을까? 
           sc.divide(4, 2);
           sc.divide(3, 2); 
   }
}