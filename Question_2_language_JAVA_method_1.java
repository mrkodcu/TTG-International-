/*# TTG International - Mülakat Çözümleri:
###### 2.SORU JAVA METHOD 1 ######*/
import java.util.Arrays;
import java.util.Collections;
public class Question_2_language_JAVA_method_1 {
    static void rotate(Integer a[],int b){
        Collections.rotate(Arrays.asList(a), -b);
    }
    public static void main(String[] args){
        Integer[] a = {1,2,3,4,5,6};
        rotate(a,1);
        System.out.println(Arrays.toString(a));
    }
}
/*Bana kalırsa javada öteleme yapmak için en kolay yöntem.İstenirse kullanıcıdan 
veri alınarakda apılabilir örneğin:
 
 static void rotate(Integer array[],int b){
         Collections.rotate(Arrays.asList(array), -miktar);
    }
 public static void main(String[] args){
        Scanner deger = new Scanner(System.in);
        System.out.println("Array Boyutu Giriniz:");
        int boyut = deger.nextInt();
        int [] array = new int[boyut];
        System.out.println("Elemanları Giriniz:");

        for(int i=0; i<boyut; i++ ) {
            array[i] = deger.nextInt();
        }

        System.out.println("Öteleme Miktarı Giriniz:");
        int miktar = deger.nextInt();
        rotate(array,miktar);
        System.out.println(Arrays.toString(array));
    }
#################################/*
