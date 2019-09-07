# TTG International - Mülakat Çözümleri:
###### 1.SORU PYTHON METHOD 2 ######
def findMissing(a, b, n, m):
    sayac = 0
    for i in range(n):
        for j in range(m):
            if (a[i] == b[j]):
                sayac=0
                break
            sayac += 1

        if (sayac==m):
            print(a[i], end=" ")
            sayac=0

if __name__ == "__main__":

    a = [4, 12, 9, 5, 6, 1]
    b = [4, 9, 12, 6]
    n = len(a)
    m = len(b)
    findMissing(a, b, n, m)
    
#Öncelikle for içinde for ile teker teker A arayinin kaşılığı B arayinin içinde var mı diye deniyoruz
#Eğer yok ise sayacı 1 arttırıyoruz B arayimizin toplam eleman sayısnı m değişkeninde bulmuştuk.
#Eğer sayacımız toplam eleman sayısına eşit olursa buradan çıkaracağımız sonuç istediğimiz verinin B arayinda olmayışıdır.
#Kodda yine  belli değişikler yapılabilir örneğin findMissing foksiyonuna sadece Arrayler yollanabiliriz örneğin:

#def findMissing(a, b):
#    n = len(a)
#    m = len(b)
#    sayac = 0
#    for i in range(n):
#        for j in range(m):
#            if (a[i] == b[j]):
#                sayac=0
#                break
#            sayac += 1
#
#        if (sayac==m):
#            print(a[i], end=" ")
#            sayac=0
#
#if __name__ == "__main__":
#
#    a = [4, 12, 9, 5, 6, 1]
#    b = [4, 9, 12, 6]
#    findMissing(a, b)
####################################
