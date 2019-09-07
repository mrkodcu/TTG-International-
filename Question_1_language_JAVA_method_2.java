/*# TTG International - Mülakat Çözümleri:
###### 1.SORU JAVA METHOD 2 ######*/
import java.util.HashSet;
public class Question_1_language_JAVA_method_2 {
    static void findMissing(int a[], int b[],
                            int n, int m)
    {
        HashSet<Integer> sozluk = new HashSet<>();
        for (int i = 0; i < m; i++)
            sozluk.add(b[i]);
        for (int i = 0; i < n; i++)
            if (!sozluk.contains(a[i]))
                System.out.print(a[i] + " ");
    }
    public static void main(String []args){

        int a[] = { 4, 12, 9, 5, 6, 1 };
        int b[] = { 4, 9, 12, 6 };
        int n = a.length;
        int m = b.length;
        findMissing(a, b, n, m);
    }
}
/*Method bir dekinden farklı olarak bir Hashset yapısı kullandık.İstenildiği taktirde yine n ve m değişkenleri
fonksiyonun içine kaydırılabilir.Örnek:
import java.util.HashSet;
public class Question_1_language_JAVA_method_2 {
    static void findMissing(int a[], int b[])
    {
        int n = a.length;
        int m = b.length;
        HashSet<Integer> sozluk = new HashSet<>();
        for (int i = 0; i < m; i++){...}
        for (int i = 0; i < n; i++){...}
    }
    public static void main(String []args)
    {
        int a[] = { 4, 12, 9, 5, 6, 1 };
        int b[] = { 4, 9, 12, 6 };
        findMissing(a, b);
    }
}
#################################/*
