using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    class Program
    {
        static void Main(string[] args)
        {
            string yourName;
            int yourAge;

            Console.WriteLine("What is your name?");
            yourName = Console.ReadLine();

            Console.WriteLine("Hello {0}! Glad to meet you. You'll be a C# winner!", yourName);
            
            Console.WriteLine("What is your age?");

            yourAge = Convert.ToInt32(Console.ReadLine());
            
            Console.WriteLine("Your age is {0}.", yourAge);

        }
    }
}
