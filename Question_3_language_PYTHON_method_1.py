def grubu_düzenle():
    unique_list = []
    bilgiler = []
    kactane = []
    adet = txtdosyasi.readline()

    if(int(adet)<=100000):

        for i in range(int(adet)):
            bilgiler += [txtdosyasi.readline().split()]
         bilgiler.sort(key=lambda bilgiler: (bilgiler[0], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5]))

        for i in range(len(bilgiler)):
            tane = bilgiler.count(bilgiler[i])
            kactane.append(tane)

        for i in range(len(bilgiler)):
            bilgiler[i].append(kactane[i])

        for x in bilgiler:
            if x not in unique_list:
                unique_list.append(x)

        for x in unique_list:
            with open("veriyeni.txt", "a") as f:
                f.write(str(x).replace("[", "").replace("]", "").replace(",", "").replace("'", ""))
                f.write("\n")
    else:
        print("Düzenlemmek istediğiniz hesap sayısı 100.000 den fazla")


def grup_bul():
    grupsayisi = txtdosyasi.readline()
    if(int(grupsayisi)<=5):
        for i in range(int(grupsayisi)):
            grubu_düzenle()
            txtdosyasi.readline()  # bosluk için
            with open("veriyeni.txt", "a") as f:
                f.write("\n")
    else:
        print("Düzenlemek istediğiniz grup sayısı 5 den fazla")


if __name__ == "__main__":
    txtdosyasi = open("veri.txt", "r")
    grup_bul()
    txtdosyasi.close()
#Sıralama işlemini öncelikli olarak baştaki 2 digital control numarası sonrasında sondaki 16 kişisel digital koda göre sıraladık eğer direk
#sort methodu ile sıralasak ortaki 8 banka kodunuda işin içine katacağı için iyi bir sonuç alamayabilirdik.
#Dosyaya grup grup yazdırmak yerine toplu bir şekildede yazdırabilirdik lakin programda bir sıkıntı çıkarsa ne kadar veri kurtarabilirsek kar mantığını 
#düşünrek iş bölümü yapıp parça parça yazdırma kararı aldım.
