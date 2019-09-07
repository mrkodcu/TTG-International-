/*# TTG International - Mülakat Çözümleri:
###### 2.SORU JAVA METHOD 3 ######*/
import java.util.Arrays;
public class Question_2_language_JAVA_method_3 {
    void Rotate(int arr[], int d)
    {   int uzunluk=arr.length;
        int i, j, k, temp;
        int oteleme = otelemeyeri(d,uzunluk);
        for (i = 0; i < oteleme; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= uzunluk)
                    k = k - uzunluk;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    int otelemeyeri(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return otelemeyeri(b, a % b);
    }
    public static void main(String[] args)
    {
        Question_2_language_JAVA_method_3 rotate = new Question_2_language_JAVA_method_3();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rotate.Rotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
/*Çok bu yöntemi sevmesemde okulda veri yolları dersinde öğretilen bir yöntem öncelikle veri sona atılarak işlem devam ediyor.
Yani bir veri ötelemek istenirse  baştaki bir veri sırası ile sona konuyor.Bir nevi method 1 in manuel versiyonu gibi
#################################/*
