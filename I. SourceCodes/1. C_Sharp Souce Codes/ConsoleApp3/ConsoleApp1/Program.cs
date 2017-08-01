/*******************************************************************************
 * 
 * Sololearn C# Methods : Passing Arguments 2nd page Example
 * Call by value, Call by reference 중 Call by reference 구현의 예
 * Argument에도 Parameter에도 ref 키워드를 사용해야 함
 * (2017. 7. 26)
 * 
 * *****************************************************************************/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Sqr(ref int x)
        {
            x = x * x;
        }
        static void Main(string[] args)
        {
            int a = 3;
            Sqr(ref a);

            Console.WriteLine(a);
            //OperatingSystem("pause");
        }
    }
}
