def factorial(n, depth=0):
    indent = "  " * depth  # indentation to show recursion level
    print(f"{indent}→ Calling factorial({n})")

    # Base case
    if n == 0 or n == 1:
        print(f"{indent}↳ Base case reached: factorial({n}) = 1")
        return 1
    else:
        # Recursive call
        result = n * factorial(n - 1, depth + 1)
        print(f"{indent}↩ Returning from factorial({n}): {n} * factorial({n-1}) = {result}")
        return result


# Example usage
bil = int(input("Masukkan Bilangan : "))
print("\nFinal Result:", factorial(bil))