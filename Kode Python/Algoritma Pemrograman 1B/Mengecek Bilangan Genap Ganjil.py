n = int(input("Tampilkan Bilangan sampai: "))

print ("\nBilangan Genap:")
for i in range(1,n+1):
    if i % 2 == 0:
        print(i, end=" ")
    
print("\nBilangan Ganjil:")
for i in range(1, n+1):
    if i % 2 != 0:
        print(i, end=" ")

