/*# TTG International - Mülakat Çözümleri:
###### 1.SORU CSHARP METHOD 2 ######*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Question_1_language_CSHARP_method_2
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 4, 12, 9, 5, 6, 1 };
            int[] b = { 4, 9, 12, 6 };
            findMissing(a, b); 
        }
        static void findMissing(int[] a, int[] b)
        {
            int n = a.Length;
            int m = b.Length;
            HashSet<int> hashset = new HashSet<int>();
            for (int i = 0; i < m; i++)
                hashset.Add(b[i]);
            for (int i = 0; i < n; i++)
                if (!hashset.Contains(a[i]))
                    Console.Write(a[i] + " ");
            Console.ReadKey();
        }  
    }
}
/*Phyton daki method ile tamamen aynı işlevdeki c# programı, arasındaki fark sadece dict yerine sözlük olarak
hashset kullanıyoruz.
####################################*/
