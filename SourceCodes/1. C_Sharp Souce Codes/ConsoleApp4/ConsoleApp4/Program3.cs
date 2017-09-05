/*******************************************************************************
 * 
 * Sololearn C# Classes & Objects의 Property 예제 변형
 * C++이나 Java와 달리 훨씬 편리하게 setter와 getter 기능 구현함
 * private data member를 마치 public data member처럼 이용함
 * 관습적 규약 : Properties have the same name as the private field with a capital letter.
 * cf. 1. Property 중 일부(ex. getter나 setter 안 써도 됨)
 *        set accessor를 빠트리면 Read-only property가 된다.
 *     2. Property도 private으로 할 수 있다고 함...그러면 굳이 Property를 쓸 이유가 없으니 일반적인 경우는 아닌 듯하다.
 *
 * So, why use properties? Why not just declare the member variable public and access it directly?
 * With properties you have the option to control the logic of accessing the variable. 
 * For example, you can check if the value of age is greater than 0, before assigning it to the variable:
 * You can have any custom logic with get and set accessors.
 * "그렇다면 왜 속성을 사용하는가?"라는 의문이 들 수 있다. 
 * 왜 멤버 변수를 public으로 선언하고 직접 액세스 하지 않는 것이 좋을까?
 * 1. 속성을 사용하면 변수에 액세스하는 Logic을 제어할 수 있다. 
 * 예를 들어 변수에 할당하기 전에 age 값 이 0보다 큰지 확인할 수 있다 .
 * 2. 접근자(Accessor)를 사용하여 사용자 정의 논리를 구현할 수 있다.
 * 아래 예제를 보라.
 * 
 * 이 Source Code에 추가된 내용 : Auto-Implemented Properties
 * 놀랍게도 C#에선 편리한 Property 기능을 이용하여 private data member를 대체할 수 있다!!!
 * Syntax : public string Name { get; set; }
 * As you can see, you do not need to declare the private field name separately!
 * it is created by the property automatically. Name is called an auto-implemented property. 
 * Also called auto-properties, they allow for easy and short declaration of private members.
 * (2017. 7. 27)
 * 
 * *****************************************************************************/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
    class Program
    {
        class Person
        {
            private int age;
            //private string name;

            public string Name { get; set; }    // 이렇게 하고 private data member를 없앴다!

            public int Age          // 이렇게 Naming한다.
            {
                set {
                    if (value > 0)  // 값을 바로 Set하기 전에 Validation Check할 수 있다.
                        age = value;
                }
                get { return age; } // get { return x * x; } 처럼 값을 처리하여 return할 수도 있다.
            }

        }

        static void Main(string[] args)
        {
            string yourName;
            int yourAge;
            Person p = new Person();

            Console.WriteLine("What is your name?");
            yourName = Console.ReadLine();
            p.Name = yourName;      // Property 기능을 이용하여 private data member에 쉽게 값을 set한다.

            Console.WriteLine("What is your age?");
            yourAge = Convert.ToInt32(Console.ReadLine());
            p.Age = yourAge;        // C#에 고유한 Property 이용하여 private data member에 값을 Setting함

            Console.WriteLine("\nC#에 고유한 Property 기능을 이용하여 private data member에 값을 Read/Write함(3)");
            Console.WriteLine("Your Name : {0} ", p.Name);    // C#에 고유한 Property 이용
            Console.WriteLine("Your Age : {0} ", p.Age);      // C#에 고유한 Property 이용

        }
    }
}
