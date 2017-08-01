/*****************************************
* Object Oriented Programming :
* Classes vs. Structures
*****************************************/
/* 
Structure instances are always passed by value, and class instances are always passed by reference. This means that they are suited to different kinds of tasks. 
As a general guideline, consider creating a structure instead of a class when one or more of these conditions apply:

1. The structure's primary purpose is to encapsulate a few relatively simple data values.
2. It is reasonable to expect that the encapsulated values will be copied rather than referenced when you assign or pass around an instance of that structure.
3. Any properties stored by the structure are themselves value types, which you would also expect to be copied, as opposed to being referenced.
4. It is not necessary for the structure to inherit properties or behavior from another existing type.

For example, the size of a geometric shape would be a good choice for a structure, with the structure perhaps encapsulating a width property and a height property, both of type Double.

In all other cases, define a class. You will find that most custom data constructs should be defined as classes rather than as structures.

(이하는 구글 번역)
구조체 인스턴스는 항상 값에 의해 전달되며 클래스 인스턴스는 항상 참조로 전달됩니다. 이것은 그들이 다양한 종류의 작업에 적합 함을 의미합니다.
일반적인 지침으로 다음 조건 중 하나 이상이 적용될 때 클래스 대신 구조를 만드는 것을 고려하십시오.

1. 구조체의 주요 목적은 몇 가지 비교적 간단한 데이터 값을 캡슐화하는 것입니다.
2. 캡슐화된 값이 해당 구조의 인스턴스를 지정하거나 전달할 때 참조되지 않고 복사된다는 것을 예상하는 것이 합리적입니다.
3. 구조체에 저장된 모든 특성은 그 자체가 값 유형이며, 참조되는 것과는 대조적으로 복사될 것으로 예상됩니다.
4. 구조가 다른 기존 유형의 특성 또는 작동을 상속하지 않아도 됩니다.

예를 들어, 기하학적 모양의 크기는 Double 유형 모두 width 속성과 height 속성을 캡슐화한 구조로 구조에 적합한 선택입니다.

다른 모든 경우에는 클래스를 정의하십시오. 대부분의 사용자 정의 데이터 구조는 구조가 아닌 클래스로 정의되어야합니다.
*/
class StepCounter {
 var totalSteps: Int = 0 {
   willSet(newSteps) {
     print("About to set totalSteps to \(newSteps)")
   }
   didSet {
     if totalSteps > oldValue  {
       print("Added \(totalSteps - oldValue) steps")
     }
   }
 }
}
let stepCounter = StepCounter()
stepCounter.totalSteps = 50
// About to set totalSteps to 50
// Added 50 steps
stepCounter.totalSteps = 150
// About to set totalSteps to 150
// Added 100 steps
stepCounter.totalSteps = 420
// About to set totalSteps to 420
// Added 270 steps