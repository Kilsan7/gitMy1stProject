using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
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

            /* Setter */
            public void setAge(int age)
            {
                this.age = age;
            }
            
            /* Getter */
            public string getName()
            {
                return name;
            }
            public int getAge()
            {
                return age;
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
            p.setAge(yourAge);

            Console.WriteLine("Your Name : {0} ", p.getName());
            Console.WriteLine("Your Age : {0} ", p.getAge());

        }
    }
}
