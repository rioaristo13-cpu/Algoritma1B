#Pemilihan 3 bentuk bangunan 
while True:
	try:
		bentuk = int(input("Pilih salah satu nomor, 1 - segitiga, 2 - lingkaran, 3 - trapesium: "))
	except ValueError:
		print("Masukkan harus berupa angka 1, 2, atau 3. Silakan coba lagi.")
		continue
	if bentuk in (1, 2, 3):
		break
	print("Pilihan tidak valid. Masukkan 1, 2, atau 3.")

if bentuk == 1:
    alas = float(input("Masukkan nilai alas segitiga:"))
    tinggi = float(input("Masukkan nilai tingga segitiga:"))
elif bentuk == 2:
    jari = float(input("Masukkan nilai jari2 lingkaran:"))
elif bentuk == 3:
    sisi1 = float(input("Masukkan nilai sisi sisi sejajar 1 trapesium:"))
    sisi2 = float(input("Masukkan nilai sisi sisi sejajar 2 trapesium:"))
    ttrap = float(input("Masukkan tinggi trapesium:"))

def luas (alas, tinggi, jari, sisi1, sisi2, ttrap):
	segitiga = (alas * tinggi)/2
	lingkar = 3.14 * jari^2
	trapesium = ((sisi1 + sisi2) * ttrap)/2
	return luas

luas ()
print (luas)	


