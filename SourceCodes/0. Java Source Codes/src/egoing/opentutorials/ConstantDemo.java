/****************************************************
* 
* egoing Java : enum 수업 동영상 중 4/4
* Subject : Java에 나중에 도입된 enum의 편리성  
*           상수의 기능 + Arrray처럼 쓸 수도 있고 Class라서 필요시 변수나 메소드도 가질 수 있다.
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

위와 아래의 enum 선언 내용은 거의 동일하다. 간결한 코드 + Switch문에서도 사용 가능
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
}
아래처럼 attribute 추가 가능, method도 추가 가능 
*/
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	/*테스트를 위해 생성자를 만들어 본다. 순전히 테스트용일 뿐이다. 
	  이걸 만들지 않아도 enum 사용엔 전혀 지장이 없다. */ 
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
            //System.out.println(f);					// 아래 코드와 비교
            System.out.println(f+"의 색깔은 "+f.getColor());	// 이렇게 필요시 enum에 추가한 데이터 필드나 메소드 기능 이용 가능
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