/*# TTG International - Mülakat Çözümleri:
###### 2.SORU CSHARP METHOD 3 ######*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Question_2_language_CSHARP_method_3
{
    class Program
    {
        static void rotate(int[] arr, int d)
        {
            int n = arr.Length;
            int i, j, k, temp;
            int _otele = otele(d, n);
            for (i = 0; i < _otele; i++) {
                temp = arr[i];
                j = i;
                while (true) {
                    k = j + d;
                    if (k >= n)
                        k = k - n;
                    if (k == i)
                        break;
                    arr[j] = arr[k];
                    j = k;
                }
                arr[j] = temp;
            }
        }
        static int otele(int a, int b)
        {
        if (b == 0)
            return a;
        else
            return otele(b, a % b);
        }
        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            rotate(arr, 1);
            Console.WriteLine(String.Join(" ", arr));
        }
    }
}
/*Java kodumuzun c# versiyonu istenirse yine kullanıcıdan array ve oteleme değeri alınabilir.
####################################*/
