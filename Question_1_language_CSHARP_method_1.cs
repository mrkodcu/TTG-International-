/*# TTG International - Mülakat Çözümleri:
###### 1.SORU CSHARP METHOD 1 ######*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Question_1_language_CSHARP_method_1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 4, 12, 9, 5, 6, 1 };
            int[] b = { 4, 9, 12, 6 };
            findMissing(a, b);
            Console.ReadKey();
        }
        static void findMissing(int[] a, int[] b)
        {
            int n = a.Length;
            int m = b.Length;
            for (int i = 0; i < n; i++)
            {
                int j;
                for (j = 0; j < m; j++)
                    if (a[i] == b[j])
                        break;
                if (j == m)
                    Console.Write(a[i] + " ");
            }
        } 
    }
}
/*Pyhtonda açıklamasını yaptığım method 2 ile tamamen aynı mantık üzerine yazılmış c# programıdır.
 * arasındaki tek fark orada sayaç kullanmıştık burada ise j==m yöntemini kullanıyoruz.Aynı yöntemi phytonda denedim lakin array boyutları değiştiği
 * zaman sorun çıkarıyormuş gibi geldi ama sharpta böyle bir problem yok
 *####################################*/
