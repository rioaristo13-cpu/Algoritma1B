f = 'teks.txt'

print("Method read")
print("-----------")
with open(f, 'r') as teks:
    sf = teks.read()
print(sf)

print("\nMethod readline")
print("-----------")
with open(f, 'r') as teks:
    sb = teks.readline()
print (sb)

print("\nMethod readlines")
print("-----------")
with open(f, 'r') as teks:
    lf = teks.readlines()

    listbersih = []
    for baris in lf:
        listbersih_baris = baris.rstrip('\n')
        listbersih.append(listbersih_baris)
    lf = listbersih

print (lf)
