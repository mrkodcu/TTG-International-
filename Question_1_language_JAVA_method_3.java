/*# TTG International - Mülakat Çözümleri:
###### 1.SORU JAVA METHOD 3 ######*/
import java.util.ArrayList;
import java.util.List;

public class Question_1_language_JAVA_method_3 {
    static void findMissing(int a[], int b[]){
        List<Integer> list1 = new ArrayList<>();
        for(int i =0;i<a.length;i++){
            list1.add(a[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i =0;i<b.length;i++){
            list2.add(b[i]);
        }
        List<Integer> notCommonElements = new ArrayList<>(list1);
        notCommonElements.removeAll(list2);
        notCommonElements.forEach(element -> {
            System.out.println(element);
        });
    }

    public static void main(String[] args) {
        int a[] = { 4, 12, 9, 5, 6, 1 };
        int b[] = { 4, 9, 12, 6 };
        findMissing(a, b);

    }
}
/*Çok tercih etmesemde buda değişik bir çözüm yöntemi önce arraylerimizi teker teker listeye atıyoruz sonra birinci
listeden ikinci listemizi çıkarıyoruz kalanlar sonucumuz oluyor.*/
#################################/*
