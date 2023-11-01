def main():
    num1=int(input("Enter the first number : "))
    num2=int(input("Enter the second number : "))
    num3=int(input("Enter the third number : "))
    isCalc(num1,num2,num3)

def isCalc(a,b,c):
    if (a < b and a < c):
        print(f"{a} is the smallest amongst.")
    elif(b < a and nb < c):
        print(f"{nb} is the smallest amongst.")
    else:
        print(f"{c} is the smallest amongst.")

if __name__ == "__main__":
    main()