kata = input("Masukkan kata untuk menjadi segitiga siku siku:")
kata1 = len(kata)

def print_segitiga_siku(rows, kata):
    for i in range(1, rows + 1):
        # Print a portion of the kata, repeated if needed
        print(kata[:i] * (i // len(kata)) + kata[:i % len(kata)]) 

# Example usage:
print_segitiga_siku(kata1, kata)

