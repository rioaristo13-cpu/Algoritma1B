#Data
import searching

data1 = [1,3,4,6,7,4,9,10,2,5,8,11]
data2 = [1,7,8,9,10,11,13,16,22,23,24,56]

print(f"Jumlah data1 {len(data1)}")
print(f"Jumlah data2 {len(data2)}\n")

print(f"Elemen target 7 ada di index ke-{searching.linear_search(data1,7)}")

print(f"Elemen target 7 ada di index ke-{searching.binary_search(data2,23)}")


