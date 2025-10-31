#Mengambil input dari terminal untuk x dan y
x = int(input("Masukkan Nilai X:"))
y = int(input("Masukkan Nilai Y:"))

#Fungsi untuk menilai f(x, y)
def fungsi(x,y):
    f = x**3 + 3*x**2 + 6*x*y**2 + y**3
    print (f)

#Memanggil fungsi "fungsi" untuk menghitung 2 variable
fungsi(x,y)