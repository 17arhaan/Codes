def main():
    a=int(input("enter the first number: "))
    b=int(input("enter the first number: "))
    c=int(input("enter the first number: "))
    average(a,b,c)

def average(*numbers):
    sum = 0
    for i in numbers:
        sum += i
    print("Average =",sum/len(numbers))

if __name__ == "__main__":
    main()