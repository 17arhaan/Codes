x=int(input("Enter a number: "))

match x:
    case 0:
        print(x," is zero")
    case _ if x>=1:
        print(x,"is positive")
    case _:
        print(x,"is negative")