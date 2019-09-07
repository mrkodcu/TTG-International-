/*# TTG International - Mülakat Çözümleri:
###### 1.SORU JAVA METHOD 1 ######*/
public class Question_1_language_JAVA_method_1 {
    static void findMissing(int a[], int b[],int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;
            if (j == m)
                System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int a[] = { 4, 12, 9, 5, 6, 1 };
        int b[] = { 4, 9, 12, 6 };
        int n = a.length;
        int m = b.length;
        findMissing(a, b, n, m);
    }
}
/*Sorudaki gibi fonkisyonun aynısı istenirse n,m değişkenleri atılabilir.
çünkü zaten iki fonksiyonunda uzunluğunu biliyoruz.Manuel olarak elle n ve m değişkenlerinin olduğu yere
6 ve 4 uzunluğunu girebiliriz veya uzunluk ölçmeyi  fonksiyonun içine alabiliriz. Örneğin :

public class Question_1_language_JAVA_method_1 {
    static void findMissing(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < n; i++)
        {...}
    }
    public static void main(String[] args)
    {
        int a[] = { 4, 12, 9, 5, 6, 1 };
        int b[] = { 4, 9, 12, 6 };
        findMissing(a, b);
    }
}
#################################/*
