/*# TTG International - Mülakat Çözümleri:
###### 2.SORU CSHARP METHOD 1 ######*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Question_2_language_CSHARP_method_1
{
    class Program
    {
        public static int[] rotate(int[] array, int miktar)
        {
            IEnumerable<int> newEnd = array.Take(miktar);
            IEnumerable<int> newBegin = array.Skip(miktar);
            return newBegin.Union(newEnd).ToArray();
        }

        static void Main(string[] args)
        {
           
            int[] n = { 1, 2, 3, 4, 5, 6 };
            int d = 1;
            int[] otele = rotate(n, d);
            Console.WriteLine(String.Join(" ", otele));
            Console.ReadKey();
        }
    }
}
/*Bence c# da yapılabilcek en basit oteleme şekli biz arrayimizi ve miktarı önceden bildiğimiz için programda manuel olarak kodladık
istenirse kullanıcıdan veri girilebilecek şekildede yazılabilir.
####################################*/
