/*******************************************************************************
 * 
 * Sololearn C# Classes & Objects의 Property 예제 변형
 * C++이나 Java와 달리 훨씬 편리하게 setter와 getter 기능 구현함
 * private data member를 마치 public data member처럼 이용함
 * cf. 1. Property 중 일부(ex. getter나 setter 안 써도 됨)
 *        set accessor를 빠트리면 Read-only property가 된다.
 *     2. Property도 private으로 할 수 있다고 함...그러면 굳이 Property를 쓸 이유가 없으니 일반적인 경우는 아닌 듯하다.
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
            private string name;
            public Person(string nm)
            {
                name = nm;
            }

            /* C#에 고유한 Coding convention을 따라 Property를 이용한다.
               Property는 여타 OOP의 getter와 setter를 모아놓은 것으로
               getter와 setter를 합쳐 accessors라고 한다.
               private data member들에 값을 할당하거나 읽는 용도로 사용한다. 
               관습적 규약 : Properties have the same name as the private field with a capital letter. */

            public string Name   //이렇게 Naming한다.
            {
                set { name = value; }
                get { return name; }
            }
            public int Age       //이렇게 Naming한다.
            {
                set { age = value; }
                get { return age; }
            }

        }

        static void Main(string[] args)
        {
            string yourName;
            int yourAge;

            Console.WriteLine("What is your name?");
            yourName = Console.ReadLine();

            Person p = new Person(yourName);

            Console.WriteLine("What is your age?");
            yourAge = Convert.ToInt32(Console.ReadLine());
            p.Age = yourAge;       // C#에 고유한 Property 이용하여 private data member에 값을 Setting함

            Console.WriteLine("\nC#에 고유한 Property 기능을 이용하여 private data member에 값을 Read/Write함");
            Console.WriteLine("Your Name : {0} ", p.Name);    // C#에 고유한 Property 이용
            Console.WriteLine("Your Age : {0} ", p.Age);      // C#에 고유한 Property 이용

        }
    }
}
