class BankAccount:
    def __init__(self, owner, balance):
        self.owner = owner
        self.__balance = balance
    def get_balance(self):
        return self.__balance
    def set_balance(self, amount):
        if amount >= 0 :
            self.__balance = amount
        else:
            print("Saldo tidak boleh negatif!")

account = BankAccount("Aristo", 1000)
print(f"Pemilik : {account.owner}")
print(f"Balance : {account.get_balance()}")

bbaru = int(input("Masukkan balance baru : "))
account.set_balance(bbaru)

print(f"Balance Baru : {account.get_balance()}")
account.set_balance(-500)  