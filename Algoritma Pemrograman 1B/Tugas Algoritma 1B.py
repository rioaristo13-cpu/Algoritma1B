#kata adalah string yang ingin dicetak menjadi pola segitiga siku2
kata = input("Masukkan kata:")

#outer for loop memasukkan jumlah karakter dari variable kata dengan fungsi len dalam fungsi range
for baris in range(len(kata)): 
    for kolum in range(baris+1): #inner loop mencetak satu karakter dari variable kata sesuai indexnya untuk setiap baris+1  
        print(kata[kolum], end="")
    print() #mencetak ke line berikut