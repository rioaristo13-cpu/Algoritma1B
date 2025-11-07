print("=== Program Operasi dalam List ===")

lister = []

banyak = int(input("Banyak elemen dalam list: "))

for i in range (banyak):
    isi = input (f"Masukkan isi list ke-{i+1}: ")
    lister.append(isi)

print("Isi List saat ini : ")
print(lister)

tambah = input("\nApakah ingin menambah isi lagi? (ya/tidak): ")
if tambah == "ya":
    isi2 = input ("Masukkan isi list tambahan: ")
    lister.append(isi2)

# menu operasi list
while True:
    print("\n== MENU PILIHAN ==")
    print("1. Tambah Data dengan Indeks")
    print("2. Reverse Data")
    print("3. Sorting Data")
    print("4. Keluar")

    pilihan = input("Pilih menu (1-4): ")

    if pilihan == "1":
        i = int(input("Data mau dimasukkan ke indeks berapa?"))
        j = input("Isi data: ")
        print("Berikut isi list awal:", lister)
        lister.insert(i, j)
        print("Berikut isi list yang sudah ditambah:", lister)

    elif pilihan == "2" :
        print("Berikut ist list awal:", lister)
        lister.reverse()
        print("Berikut fsi list yang sudah direverse:", lister)

    elif pilihan == "3":
        print("Herikut ini lint awal:", lister)
        lister.sort()
        print("Berikut ini list yang sudah disorting:", lister)

    elif pilihan =="4":
        print("\nProgram berhenti. Terima kasih!")
        break
        
    else:
        print("Pilihan tidak valid, coba lagi!")