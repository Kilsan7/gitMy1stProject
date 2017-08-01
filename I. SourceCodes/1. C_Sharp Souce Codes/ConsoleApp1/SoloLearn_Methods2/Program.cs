/*******************************************************************************
 * 
 * Sololearn C# Methods : Passing Arguments 3rd page Example
 * Call by output 구현의 예(Call by reference와 Syntax는 비슷하나 신기하게도
 * 메소드에서 Output을 끌어낸다. Return 방식이 아니다!!!
 * Argument에도 Parameter에도 out 키워드를 사용해야 함
 * (2017. 7. 26)
 * 
 * *****************************************************************************/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn_Methods2
{
    class Program
    {
        static void GetValues(out int x, out int y)
        {
            x = 5;
            y = 42;
        }

        static void Main(string[] args)
        {

            int a, b;
            GetValues(out a, out b);
            //Now a equals 5, b equals 42

        }
    }
}
