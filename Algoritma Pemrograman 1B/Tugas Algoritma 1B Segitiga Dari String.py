#kata adalah string yang ingin dicetak menjadi pola segitiga siku2
kata = input("Masukkan kata:")

#outer for loop memasukkan jumlah karakter dari variable kata dengan fungsi len dalam fungsi range
for baris in range(len(kata)): 
    for kolum in range(baris+1): #inloop dari range baris+1, print index kolum -> kata  
        print(kata[kolum], end="")
    print() #mencetak ke line berikut
