end=int(input("Enter the range: "))
for i in range(1 , end):
    if (i==5):
        print("this is the 5th iteration")
        continue    
    if (i==end-1):
        print("this is the last iteration ")
        break
    print("5 x",i,"=",5*i)