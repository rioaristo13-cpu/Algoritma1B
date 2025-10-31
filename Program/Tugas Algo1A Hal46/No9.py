
#Nilai Matkul x dan y Calon
x = int(input("Masukkan Nilai Matkul x:"))
y = int(input("Masukkan Nilai Matkul y:"))

#Prestasi = 60% matkul x + 40% matkul y
prestasi = (0.6*x)+(0.4*y)
print (prestasi)

#Cek prestasi
if prestasi > 69:
    print("Diterima")
elif prestasi > 49:
    print("Cadangan")
else:
    print("Tidak Diterima") 