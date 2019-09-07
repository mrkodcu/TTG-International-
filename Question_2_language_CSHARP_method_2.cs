/*# TTG International - Mülakat Çözümleri:
###### 2.SORU CSHARP METHOD 2 ######*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Question_2_language_CSHARP_method_2
{
    class Program
    {
        static void rotate(int[] array, int d)
        {
            int n = array.Length;
            for (int i = 0; i < d; i++)
            {
                int a, temp = array[0];
                for (a = 0; a < n - 1; a++)
                    array[a] = array[a + 1];
                array[a] = temp;
            }
        }
        static void Main(string[] args)
        {
            int[] array = { 1, 2, 3, 4, 5, 6};
            rotate(array, 1);
            Console.WriteLine(String.Join(" ", array));
            Console.ReadKey();
        }
    }
}
/*####################################*/
