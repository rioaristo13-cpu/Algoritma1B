import searching

data1 = [1,3,4,6,7,4,9,10,2,5,8,11]
data2 = [1,7,8,9,10,11,13,16,22,23,24,56]

index1 = searching.linear_search(data1,7)
index2 = searching.binary_search(data2,23)

print(f"Elemen target 7 ada di index ke-{index1}")
print(f"Elemen target 7 ada di index ke-{index2}")


