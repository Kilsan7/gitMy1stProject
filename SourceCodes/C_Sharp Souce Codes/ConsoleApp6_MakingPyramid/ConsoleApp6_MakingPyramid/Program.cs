/*******************************************************************************
 * 
 * Sololearn C# Methods의 Making a Pyramid 예제
 * DrawPyramid does not need to return a value and takes an integer parameter n.
 * In programming, the step by step logic required for the solution to a problem is called an algorithm. The algorithm for MakePyramid is:
 * 1. The first row should contain one star at the top center of the pyramid. The center is calculated based on the number of rows in the pyramid.
 * 2. Each row after the first should contain an odd number of stars (1, 3, 5, etc.), until the number of rows is reached.
 * The first for loop that iterates through each row of the pyramid contains two for loops.
 * The first inner loop displays the spaces needed before the first star symbol. The second inner loop displays the required number of stars for each row, which is calculated based on the formula (2*i-1) where i is the current row.
 * The final Console.WriteLine(); statement moves the cursor to the next row.
 * 
 * User로부터 값을 입력받아 피라미드의 층을 만들도록 변형하자. --> 변형했다.
 * 계속 입력값을 변경하여 테스트할 수 있도록 do while Loop를 추가함.
 * (2017. 7. 27)
 * 
 * *****************************************************************************/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp6_MakingPyramid
{
    class Program
    {
        static void DrawPyramid(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                for (int j = i; j <= n; j++)
                {
                    Console.Write("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++)
                {
                    Console.Write("*" + " ");
                }
                Console.WriteLine();
            }
        }

        static void Main(string[] args)
        {
            bool succeeded = false;

            do
            {
                int floors;

                Console.WriteLine("\n\n원하는 층수를 입력하세요. \n프로그램을 종료하려면 exit를 입력하세요.");

                //floors = Convert.ToInt32(Console.ReadLine());
                succeeded = int.TryParse(Console.ReadLine(), out floors);

                if (succeeded)
                {
                    DrawPyramid(floors);
                }
            } while (succeeded);
        }
    }
}
