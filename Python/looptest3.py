''' num=int(input("enter a number : "))
i = 0
while(i<num):
    print(i)
    i = i + 1 '''

for i in range(11):
    if (i==5):
        print("this is the 5th iteration")
        continue    
    if (i==10):
        print("this is the 10th iteration ")
        break
    print("5 x",i,"=",5*i)