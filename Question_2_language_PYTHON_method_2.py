# TTG International - Mülakat Çözümleri:
###### 2.SORU PYTHON METHOD 2 ######

def rotate(array, miktar):
    uzunluk = len(array)
    for i in range(miktar):
        temp = array[0]
        for i in range(uzunluk - 1):
            array[i] = array[i + 1]
        array[uzunluk - 1] = temp

array = [1, 2, 3, 4, 5, 6]
rotate(array, 1)
print(array)


#Java methodunun python versiyonudur.
####################################
