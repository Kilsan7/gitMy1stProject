package egoing.opentutorials;
class A{
	public String x() {
		return "���� A.x�Դϴ�.";
	}
}

class B extends A{
	public String x() {
		return "���� B.x�Դϴ�.";
	}
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		
		/*class A�� A�� inherit�� B ��� x() �ִ�. �� ���
		  A type���� B�� �ν��Ͻ��� ����� x()�� ȣ���ϸ�...B���� Overriding�� method�� ����ȴ�.
		  (1) A type���� �ν��Ͻ��� ���������Ƿ� A�� method�鸸 ����ȴ�. ���� B���� �ִ� y() ���� �� ��
		  (2) B class�� �ν��Ͻ��� ���������Ƿ� B���� Overriding�� method�� ������ �װ� �켱 ���� �� */
		String ret_msg = obj.x();    
		System.out.println(ret_msg);  //(2)
		//System.out.print(obj.y());    //(1) Error message : The method y() is undefined for the type A

	}

}
