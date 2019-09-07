# TTG International - Mülakat Çözümleri:
###### 2.SORU PYTHON METHOD 3 ######

def rotate(array, miktar):
    boyut=len(array)
    tasi = tasimasirasi(miktar, boyut)
    for i in range(tasi):
        temp = array[i]
        j = i
        while 1:
            k = j + miktar
            if k >= boyut:
                k = k - boyut
            if k == i:
                break
            array[j] = array[k]
            j = k
        array[j] = temp

def tasimasirasi(a, b):
    if b == 0:
        return a;
    else:
        return tasimasirasi(b, a % b)

array = [1, 2, 3, 4, 5, 6]
rotate(array, 1)
print(array)

#Java methodunun python versiyonudur.
####################################
