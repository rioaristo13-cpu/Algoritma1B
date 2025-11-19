def faktorial(n):
    if n <= 1:
        return 1
    else:
        result = n*faktorial(n-1)
        print(f"faktorial({n}) * faktorial ({n-1}) = {result}")
        return result


bil= int(input("Masukkan Bilangan : "))
print(f"\n{faktorial(bil)}")