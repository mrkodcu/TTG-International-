# TTG International - Mülakat Çözümleri:
###### 1.SORU PYTHON METHOD 1 ######
def findMissing(a, b):
    sozluk = dict()
    n = len(a)
    m = len(b)
    for i in range(m):
        sozluk[b[i]] = 1

    for i in range(n):
        if a[i] not in sozluk.keys():
            print(a[i], end=" ")

a = [4, 12, 9, 5, 6, 1]
b = [4, 9, 12, 6]

findMissing(a, b)

#Sözlüğün içine bütün B arrayı'nı yolluyoruz.
#A arayının içinden oluşturduğumuz sözlüğü ayıklıyoruz ve end"" ile veriler karışmasın diye boşluk bırakıyoruz.
####################################
