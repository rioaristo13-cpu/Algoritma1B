print("Masukan Angka 1")
print("Masukan Angka 2")
print("Dan Input Operator Aritmatika")
print(30*"="+"\n")
angka1 = float(input("Angka Pertama: "))
angka2 = float(input("Angka Kedua: "))
operasi = input("Masukkan Operasi (+,-,*,/): ")
                                                                    #                                           x = 50
                                                                    # 
#Operasi perhitungan                  
                              #!= itu untuk menegasi sebuah nilai, e.g if x != 50, False
if operasi == "+":                                                  #                                        if x != 100, True
    hasil = angka1+angka2
    print(f"Hasil dari {angka1} + {angka2} = {hasil}")
elif operasi == "-":
    hasil = angka1-angka2
    print(f"Hasil dari {angka1} - {angka2} = {hasil}")
elif operasi == "*":
    hasil = angka1*angka2
    print(f"Hasil dari {angka1} * {angka2} = {hasil}")
elif operasi == "/":
    if angka2 != 0:
        hasil = angka1/angka2
        print(f"Hasil dari {angka1} / {angka2} = {hasil}")
    else:
        print("Tidak Bisa Dibagi Nol")