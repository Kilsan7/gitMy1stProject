package egoing.opentutorials;
class A{
	public String x() {
		return "나는 A.x입니다.";
	}
}

class B extends A{
	public String x() {
		return "나는 B.x입니다.";
	}
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		
		/*class A나 A를 inherit한 B 모두 x() 있다. 이 경우
		  A type으로 B의 인스턴스를 만들고 x()를 호출하면...B에서 Overriding한 method가 실행된다.
		  (1) A type으로 인스턴스를 생성했으므로 A의 method들만 실행된다. 따라서 B에만 있는 y() 실행 안 됨
		  (2) B class로 인스턴스를 생성했으므로 B에서 Overriding한 method가 있으면 그게 우선 실행 됨 */
		String ret_msg = obj.x();    
		System.out.println(ret_msg);  //(2)
		//System.out.print(obj.y());    //(1) Error message : The method y() is undefined for the type A

	}

}
