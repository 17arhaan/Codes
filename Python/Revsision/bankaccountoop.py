class BankAccount():
    
    def __init__(self, name):
        self.user_name = name
        self.balance = 0
    
    def display_balance(self):
        print(f"{self.user_name} has a balance of ${self.balance} .")
    
    def withdraw_money(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"${amount} is withdrawn by {self.user_name}.")
        else:
            print("Insufficient Balance.")
    
    def deposit_money(self, amount):
        self.balance += amount
        print(f"{self.user_name} has deposited an amount of ${amount} .")

def main():
    namee = input("Enter the name of the account holder: ")
    savings_account = BankAccount(namee)
    
    depositt = int(input("Enter the amount you want to deposit: "))
    savings_account.deposit_money(depositt)
    
    withdrew = int(input("Enter the amount you want to withdraw: "))
    savings_account.withdraw_money(withdrew)
    print("\n")
    savings_account.display_balance()
    print("\n") 

if __name__ == "__main__":
    main()