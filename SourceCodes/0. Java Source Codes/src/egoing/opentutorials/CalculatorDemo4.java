/****************************************************
* 
* Multi exception check using try-catch statements
* For the test input 2 numbers
* 
* Normal Output : Qucient(first/second)
* 
* ±â´É Ãß°¡ : °³¹ßÀÚ°¡ ¸¸µç ¿¡·¯¸Þ½ÃÁö¸¦ throw¸¦ ÀÌ¿ëÇÏ¿© try/catch ±¸¹®À¸·Î º¸³»¼­ Ãâ·ÂÇÔ, ÇÁ·Î±×·¥ Crashµµ ÇÇÇÏ´Â ¿ì¾ÆÇÑ Ã³¸®¹æ½Ä
*          Á¤¹ÐÇÏ°Ô ´Ù½Ã È®ÀÎÇÒ °Í
*          ÃßÈÄ °³¼± ¿ä±¸»çÇ× - SomeClass¿Í main()¿¡ ºÐ»êµÇ¾î ÀÖ´Â ExceptionÃ³¸® ÅëÇÕ ÇÊ¿ä(Dry SolutionÀ¸·Î)
*                         throw¸¦ ¹Þ´Â main¿¡¼­ try-catch·Î ÅëÇÕÇØ¾ß ÇÔ. ÀÌ °æ¿ì ±âÅ¸ ¿¹¿Ü Ã³¸® Å×Å©´Ð ÇÊ¿ä. 
*                         ÇöÀç throw·Î ´øÁö´Â °³¹ßÀÚ »ý¼º ¿¡·¯ ¸Þ½ÃÁö´Â ¿¡·¯ ¹ß»ýÀü¿¡ ¼ÂÆÃÇÑ °ÍÀÌ¶ó »ý°¢º¸´Ù LogicÀÌ º¹ÀâÇÏ´Ù.
* 
* 2017. 8. 26   made by : Aris Kim
*/
package egoing.opentutorials;
import java.util.Scanner;

class SomeClass{
   boolean error_occurred = false;
   private int[] arr = new int[5];
   SomeClass(){
       for(int i = 0; i < 5; i++) {
    	   arr[i] = i;
       }
   }

   public void divide(int first, int second){
	 if (second == 0) {
		 throw new ArithmeticException("0À¸·Î ³ª´©´Â °ÍÀº Çã¿ëµÇÁö ¾Ê½À´Ï´Ù.");  // °³¹ßÀÚ ÀÛ¼º(Customized) Error message
	 } else if (first > (arr.length -1) || second > (arr.length -1)) {
		 throw new ArrayIndexOutOfBoundsException("ÀúÀåµÈ ArrayÀÇ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù. 0°ú " + (arr.length -1) + " »çÀÌÀÇ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä.");  // °³¹ßÀÚ ÀÛ¼º(Customized) Error message
	 }
   	 try {
            System.out.println("³ª´°¼À °á°ú(¸ò¸¸ Á¤¼ö·Î) : " + arr[first] + " / " + arr[second] + " = " + (arr[first] / arr[second]) + "ÀÔ´Ï´Ù.");
        } catch(Exception e){
        	error_occurred = true;
            System.out.println("Exception message : "+e.getMessage());
        } finally {
     	   if (error_occurred) {
     		// finally´Â Database Á¢¼Ó ÀÛ¾÷, File open ÀÛ¾÷ µî¿¡¼­ ¿¡·¯ ¿©ºÎ¿Í °ü°è¾øÀÌ ¹Ýµå½Ã Á¢¼ÓÀ» ²÷°Å³ª file openÀ» Á¾·áÇØ¾ß ÇÏ´Â °æ¿ì ¿ä±äÇÏ°Ô ¾²ÀÏ ¼ö ÀÖ´Ù.
     		   System.out.println("(¿©±â´Â finally1) ¿¡·¯ ¸Þ½ÃÁö Ãâ·Â ÈÄ¿¡µµ ÀÌ·¸°Ô Finally statement´Â ½ÇÇàµË´Ï´Ù!");
     		// finally´Â Error(Exception) À¯¹«¿Í °ü°è¾øÀÌ ¹Ýµå½Ã ½ÇÇàµÊ. ±×·¡¼­ ¿¡·¯ ¹ß»ýÇÑ °æ¿ì¿¡¸¸ ¸í·É¹®À» Ã³¸®ÇÏ´Â LogicÀ» °¡¹ÌÇÔ
    		   System.out.println("¿¡·¯°¡ ¹ß»ýÇÏÁö ¾ÊÀº °æ¿ì¿£ ÀÌ ¸Þ½ÃÁö¸¦ º¸¿©ÁÖÁö ¾ÊÀ» °Å¿ä.\n");	
    		   error_occurred = false;   // error_occurred initialization
    	   }															  		 
        }
   }
}


public class CalculatorDemo4 {
   public static void main(String[] args) {
	   boolean error_occurred = false;
       SomeClass sc = new SomeClass();
       /*Scanner myVar1 = new Scanner(System.in);
       Scanner myVar2 = new Scanner(System.in);
       if (myVar2 == 0) {
         // °³¹ßÀÚ ÀÛ¼º(Customized) Error message
		 throw new IllegalArgumentException("µÎ ¹øÂ° ÀÎÀÚÀÇ °ªÀº 0ÀÌ µÉ ¼ö ¾ø½À´Ï´Ù."); 
	   }
       sc.divide(myVar1.nextInt(), myVar2.nextInt());
       */
       // ¾Æ·¡´Â ½Å¼ÓÇÑ Å×½ºÆ®¸¦ À§ÇÑ ÄÚµå
       try {
    	   /* 
    	    * (1) Array IndexOutofBounds Exception + finally + Error ÈÄ ÇÁ·Î±×·¥ Á¤»ó ½ÇÇà Test
    	    * (2) Arithmetic Exception(Divide by zero) + finally + Error ÈÄ ÇÁ·Î±×·¥ Á¤»ó ½ÇÇà Test
    	    * (3) ±âÅ¸ Exception ¹ß»ýÁ¶°Ç(Array index check¿¡¼­ À½¼öµµ ¹Ý¿µÇÏ¸é ÇÏ³ª·Î Ã³¸®°¡´É. 
    	    *     ÀÌ°Ç ¹Ì¸® ÁöÁ¤ÇÏÁö ¾ÊÀº Exception È®ÀÎ¿ëÀÓ
    	    *     ÇöÀç (1), (2), (3)À» °¢°¢ (4)¿Í ÇÔ²² ½ÇÇàÇÏ¸é (1), (2)´Â  ¾Æ·¡ÀÇ  catch·Î throwµÇ¸é¼­ (4) ¹Ì½ÇÇà, 
    	    *     ÇÏÁö¸¸ (3)Àº SomeClass¿¡¼­ ControlÀÌ ¹ÝÈ¯µÇ¹Ç·Î (4)µµ ½ÇÇàµÊ
    	    * (4) Á¤»ó Ãâ·Â + finally(try-catch »ç¿ë½Ã Á¤»óÀÏ ¶§µµ finally´Â ½ÇÇàµÊ) Test
    	    * 
    	    */
           //sc.divide(10, 2); 		
           //sc.divide(2, 0);		
    	   sc.divide(-3, 2);
           sc.divide(4, 2);		 	    
       } catch(ArrayIndexOutOfBoundsException e){
    	   error_occurred = true;
       	   System.out.println("ArrayIndexOutOfBoundsException ¹ß»ý : "+e.getMessage());
       } catch(ArithmeticException e){
    	   error_occurred = true;
    	   System.out.println("ArithmeticException ¹ß»ý : "+e.getMessage());  
       } finally {
    	   if (error_occurred) {
    		   /*
    		    * finally´Â Database Á¢¼Ó ÀÛ¾÷, File open ÀÛ¾÷ µî¿¡¼­ ¿¡·¯ ¿©ºÎ¿Í °ü°è¾øÀÌ ¹Ýµå½Ã Á¢¼ÓÀ» ²÷°Å³ª 
    		    * file openÀ» Á¾·áÇØ¾ß ÇÏ´Â °æ¿ì ¿ä±äÇÏ°Ô ¾²ÀÏ ¼ö ÀÖ´Ù.
    		    * finally´Â Error(Exception) À¯¹«¿Í °ü°è¾øÀÌ ¹Ýµå½Ã ½ÇÇàµÊ. 
    		    * ±×·¡¼­ ¿¡·¯ ¹ß»ýÇÑ °æ¿ì¿¡¸¸ ¸í·É¹®À» Ã³¸®ÇÏ´Â LogicÀ» °¡¹ÌÇÔ 
    		    */
    		   System.out.println("(¿©±â´Â finally2) ¿¡·¯ ¸Þ½ÃÁö Ãâ·Â ÈÄ¿¡µµ ÀÌ·¸°Ô Finally statement´Â ½ÇÇàµË´Ï´Ù!"); 
    		   System.out.println("¿¡·¯°¡ ¹ß»ýÇÏÁö ¾ÊÀº °æ¿ì¿£ ÀÌ ¸Þ½ÃÁö¸¦ º¸¿©ÁÖÁö ¾ÊÀ» °Å¿ä.\n");	
    		   error_occurred = false;   // error_occurred initialization
    	   }															  		 
       }
   }
}