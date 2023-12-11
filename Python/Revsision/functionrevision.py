def main():
    a=int(input("enter the first number: "))
    b=int(input("enter the second number: "))
    c=int(input("enter the third number: "))
    average(a,b,c)
    isLargest(a,b,c)

def average(*numbers):
    sum = 0
    for i in numbers:
        sum += i
    print("Average =",sum/len(numbers))
    print("Sum = ", sum)

def isLargest(x,y,z):
    if(x>y and x>z):
        print(f"{x} is the largest.")
    elif (y>x and y>z):
        print(f"{y} is the largest.")
    else:
        print(f"{z} is the largest.")

if __name__ == "__main__":
    main()