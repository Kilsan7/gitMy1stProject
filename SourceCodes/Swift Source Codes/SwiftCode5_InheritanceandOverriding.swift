/*****************************************
* My 5th swift code example
* Inheritance and Overriding
*****************************************/
/*
A class can inherit methods, properties, and other characteristics from another class. The inheriting class is a subclass, and the class from which it inherits from is its superclass. Inheritance is a fundamental behavior that differentiates classes from other types in Swift.
*/
class Vehicle {
  var currentSpeed = 0.0
  var desc: String {
    return "traveling at \(currentSpeed) mph"
  }
  func makeNoise() {
    // do nothing
  }
}

/* ǥ�� Syntax
Subclass��:Superclass��
To indicate that a subclass has a superclass, write the subclass name before the superclass name, separated by a colon:
*/
class Bicycle: Vehicle {
   var hasBasket = false
}

/*
The new Bicycle class automatically takes on all of the characteristics of Vehicle, including properties such as currentSpeed and desc, as well as methods like makeNoise(). In addition to its inherited characteristics, the Bicycle class defines a new stored property, hasBasket.
You can also modify the inherited currentSpeed property of a Bicycle instance, and query the instance's inherited desc property:
*/
let bicycle = Bicycle()
bicycle.hasBasket = true
bicycle.currentSpeed = 25.0
print("Bicycle: \(bicycle.desc)")
//��� ��� : Bicycle: traveling at 25.0 mph

/*
Subclasses can themselves be subclassed. The next example creates a subclass of Bicycle for a two-seater bicycle, or a tandem(2�ο� ������).
*/
class Tandem: Bicycle {
   var currNumOfPassengers = 0
}

/*
If you create an instance of Tandem, you can work with any of its properties, both new and inherited. You can also query the read-only desc property it inherited from Vehicle:
*/
let tandem = Tandem()
tandem.hasBasket = true
tandem.currNumOfPassengers = 2
tandem.currentSpeed = 20.0
print("Tandem: \(tandem.desc)")
//��� ��� : Tandem: traveling at 20.0 mph

/* Overriding
A subclass can provide its own custom implementation of an instance method, type method, instance property, type property, or subscript that it would otherwise inherit from a superclass. This is known as overriding.
-> �̰� Overriding�̴�.
To override a characteristic that would otherwise be inherited, prefix the overriding definition with the override keyword.
-> Overriding Syntax�� �̷��� �Ѵ�(override keyword�� �ٿ��ش�).

The superclass version of a method, property, or subscript is accessed by using the super prefix.
-> Superclass�� member�� �̿��Ϸ��� 'super'��� prefix�� ����Ѵ�.

For example:
- An overridden method named someMethod() can call the superclass version of someMethod() by calling super.someMethod() within the overriding method implementation.
- An overridden property called someProperty can access the superclass version of someProperty as super.someProperty within the overriding getter or setter implementation.
- An overridden subscript for someIndex can access the superclass version of the same subscript as super[someIndex] from within the overriding subscript implementation.

The following example defines a new subclass of Vehicle, called Train, which overrides the makeNoise() method that Train inherits from Vehicle:
�Ʒ��� Train classs�� Vehicle class�κ��� ��ӹ��� makeNoise() method�� overriding�Ѵ�.
*/
class Train: Vehicle {
   override func makeNoise() {
     print("Choo Choo")
   }
}
// Test�غ���
let train = Train()
print("\nTrain instance�� ������� �����...")
train.makeNoise()

/* �� �ϳ��� Subclass : Car, ���ο� Property�� gear�� �ִ�. 
Vehicle class�κ��� ��ӹ��� description property�� overriding�Ͽ� custom description �����
The following example defines a new class called Car, which is a subclass of Vehicle. The Car class introduces a new stored property called gear, which has a default integer value of 1. The Car class also overrides the description property inherited from Vehicle to provide a custom description that includes the current gear:
*/
class Car: Vehicle {
  var gear = 1
  override var desc: String {
    return super.desc + " in gear \(gear)\n"
  }
}
// Test�غ���
let car = Car()
car.currentSpeed = 60.0
print("\nCar instance�� ������ Superclass�� ���� ������ ������ ���ٿ�����.")
print("Car instance's description : \(car.desc)")

/* Overriding ���� : 'final'�� �ٿ��ָ� �ȴ�.
You can prevent a method, property, or subscript override by marking it as final (such as final var, final func, final class func, and final subscript).
You can mark an entire class as final by placing the final modifier before the class keyword in its class definition (final class).
*/

