/***********************************
 * 
 * Sololearn Coding Challenge
 * Perfect Numbers Logic using C#
 * Updated : From Int Array -> Dynamic Array, For Loop -> For-each Loop
 * (2017. 7. 31)
 *
 ***********************************/
using System;
using System.Collections.Generic;

namespace C_Sharp_PerfectNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, n, sum, limit;
            int founded = 0;
            List<String> factorArr = new List<String>();

            Console.WriteLine("Please input the limit range(ex. 10000).");
            limit = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("I'll show you some perfect numbers!");

            for (i = 1; i <= 40; i++)
            {
                Console.Write("*");     // for decoration
            }
            Console.WriteLine();

            for (i = 2; i <= limit; i++)
            {
                sum = 0;
                factorArr.Clear();
                for (n = 1; n <= (i / 2); n++)
                {
                    if (i % n == 0)
                    {
                        sum += n;
                        factorArr.Add(Convert.ToString(n));
                    }
                }
                if (sum == i)
                {
                    founded++;    // For counting the number of founded prefect numbers

                    Console.Write("{0} = ", i);
                    foreach (var Item in factorArr)
                    {
                        Console.Write(Item);
                        int k = factorArr.IndexOf(Item);

                        if (k != (factorArr.Count - 1))
                            Console.Write(" + ");
                        else
                            Console.WriteLine();     // New line at the end of one array
                    }
                }
            }
            for (i = 1; i <= 40; i++)
            {
                Console.Write("*");   // for decoration
            }
            Console.WriteLine("\nPerfect numbers founded in the range is : {0}", founded);
        }
    }
}