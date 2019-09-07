/*# TTG International - Mülakat Çözümleri:
###### 2.SORU JAVA METHOD 2 ######*/
import java.util.Arrays;
public class Question_2_language_JAVA_method_2 {
    static void rotate(int arr[], int d, int n)
    {
        for (int a = 0; a < d; a++){
            int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }
    }
    public static void main(String[] args)
    {
        Question_2_language_JAVA_method_2 rotate = new Question_2_language_JAVA_method_2();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rotate(arr, 1, 6);
        System.out.println(Arrays.toString(arr));
    }
}
/*Basit bir yöntemdir ancak dikkat edilmesi gereken hususlar vardır.İlk for u unuttuğumuzu düşünelim  ve 1 ötelediğimizi düşünelim
[2,1,3,4,5,6] şeklinde olacaktı çünkü saymadığımız yani for u unuttuğumuz için bize sadece bir sıralama hakkı tanıyacaktı.
Methodda yine önceki örnekte olduğu gibi kullanıcıdan veri alınabilir, veya yine rotate(a,b,c) yerine rotate(a,b) şeklinde yapılıp
otomatik uzunluk veya manuel giriş olabilir.örneğin:
 
import java.util.Arrays;
public class Question_2_language_JAVA_method_2 {
    static void rotate(int arr[], int d) {
        int uzunluk = arr.length;
        for (int a = 0; a < d; a++) {
            int i, temp;
            temp = arr[0];
            for (i = 0; i < uzunluk - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Question_2_language_JAVA_method_2 rotate = new Question_2_language_JAVA_method_2();
        int arr[] = {1, 2, 3, 4, 5, 6};
        rotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
#################################/*
