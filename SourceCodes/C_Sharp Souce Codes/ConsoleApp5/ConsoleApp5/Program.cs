/*******************************************************************************
 * 
 * Sololearn C# Using Arrays in Loops의 예제 변형
 * C#의 foreach Loop 예제 + Multidimensional Arrays 예제
 * Syntax : 1. foreach (int k in a)
 *          2. foreach (var k in a)   //Often the keyword var is used as the type of the variable
 *                                    //The compiler determines the appropriate type for var.
 * Cf. 친절한 C#의 Array 선언과 값 할당 방법
 * Syntax : 1. string[ ] names = new string[3] {"John", "Mary", "Jessica"};   //엄격한 정통 표기법
 *             double[ ] prices = new double[4] {3.6, 9.8, 6.4, 5.9};
 *          2. string[ ] names = new string[ ] {"John", "Mary", "Jessica"};   //Array size omit 가능
 *             double[ ] prices = new double[ ] {3.6, 9.8, 6.4, 5.9};
 *          3. string[ ] names = {"John", "Mary", "Jessica"};                 //new operator 생략 가능
 *             double[ ] prices = {3.6, 9.8, 6.4, 5.9};
 * 
 * C#의 Multidimensional Array 선언 방법
 * Syntax : 1. type[, , … ,] arrayName = new type[size1, size2, …, sizeN];
 *             ex) int[ , ] x = new int[3,4];
 * Multidimensional Array 값 초기화 방법은 single-dimensional array와 동일하다.
 *             ex) int[ , ] someNums = { {2, 3}, {5, 6}, {4, 6} }; 
 * (2017. 7. 27)
 * 
 * *****************************************************************************/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp5
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Array에 값 입력 */
            int[] a = new int[10];
            for (int k = 0; k < 10; k++)
            {
                a[k] = k * 2;
            }

            /* Array에서 값 읽기 */
            Console.WriteLine("foreach Loop로 Array에서 값을 읽어서 출력한다.");

            foreach (int k in a)
            {
                Console.WriteLine(k);
            }

            /* foreach Loop로 Array에서 값을 읽어서 출력 */
            int[] arr = { 11, 35, 62, 555, 989 };
            int sum = 0;

            Console.WriteLine("\nforeach Loop로 Array에서 값 읽고 계산한 후 출력한다.");
            foreach (int x in arr)
            {
                sum += x;
            }
            Console.WriteLine(sum);


            /* foreach Loop에서 조건에 따라 값 출력 */
            int[] nums = { 5, 2, 3, 4, 7, 8, 26, 19 };

            Console.WriteLine("\nforeach Loop로 Array에서 짝수값만 출력한다.");
            foreach (var n in nums)
            {
                if (n % 2 == 0)
                    Console.WriteLine(n);
            }

            /* Multidimensional Array 예제 */
            int[,] someNums = { { 2, 3 }, { 5, 6 }, { 4, 6 } };

            Console.WriteLine("\nMultidimensional Array에서 값을 읽어 출력한다.");
            for (int k = 0; k < 3; k++)
            {
                for (int j = 0; j < 2; j++)
                {
                    Console.Write(someNums[k, j] + " ");
                }
                Console.WriteLine();    // The Console.WriteLine(); statement moves the output to a new line after one row is printed.
            }
        }
    }
}
