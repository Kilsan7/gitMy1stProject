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

(���ϴ� ���� ����)
����ü �ν��Ͻ��� �׻� ���� ���� ���޵Ǹ� Ŭ���� �ν��Ͻ��� �׻� ������ ���޵˴ϴ�. �̰��� �׵��� �پ��� ������ �۾��� ���� ���� �ǹ��մϴ�.
�Ϲ����� ��ħ���� ���� ���� �� �ϳ� �̻��� ����� �� Ŭ���� ��� ������ ����� ���� ����Ͻʽÿ�.

1. ����ü�� �ֿ� ������ �� ���� ���� ������ ������ ���� ĸ��ȭ�ϴ� ���Դϴ�.
2. ĸ��ȭ�� ���� �ش� ������ �ν��Ͻ��� �����ϰų� ������ �� �������� �ʰ� ����ȴٴ� ���� �����ϴ� ���� �ո����Դϴ�.
3. ����ü�� ����� ��� Ư���� �� ��ü�� �� �����̸�, �����Ǵ� �Ͱ��� ���������� ����� ������ ����˴ϴ�.
4. ������ �ٸ� ���� ������ Ư�� �Ǵ� �۵��� ������� �ʾƵ� �˴ϴ�.

���� ���, �������� ����� ũ��� Double ���� ��� width �Ӽ��� height �Ӽ��� ĸ��ȭ�� ������ ������ ������ �����Դϴ�.

�ٸ� ��� ��쿡�� Ŭ������ �����Ͻʽÿ�. ��κ��� ����� ���� ������ ������ ������ �ƴ� Ŭ������ ���ǵǾ���մϴ�.
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