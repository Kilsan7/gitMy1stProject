/****************************************************
* 
* egoing Java : enum ���� ������ �� 4/4
* Subject : Java�� ���߿� ���Ե� enum�� ����  
*           ����� ��� + Arrrayó�� �� ���� �ְ� Class�� �ʿ�� ������ �޼ҵ嵵 ���� �� �ִ�.
* 
* 
* 
* 2017. 8. 27   made by : Aris Kim
*/
package egoing.opentutorials;

/*class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}

���� �Ʒ��� enum ���� ������ ���� �����ϴ�. ������ �ڵ� + Switch�������� ��� ����
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
}
�Ʒ�ó�� attribute �߰� ����, method�� �߰� ���� 
*/
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	/*�׽�Ʈ�� ���� �����ڸ� ����� ����. ������ �׽�Ʈ���� ���̴�. 
	  �̰� ������ �ʾƵ� enum ��뿣 ���� ������ ����. */ 
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo {
     
    public static void main(String[] args) {
        for(Fruit f : Fruit.values()){
            //System.out.println(f);					// �Ʒ� �ڵ�� ��
            System.out.println(f+"�� ������ "+f.getColor());	// �̷��� �ʿ�� enum�� �߰��� ������ �ʵ峪 �޼ҵ� ��� �̿� ����
        }
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
                break;
        }
    }
}