#using for loop
# rangez=int(input("Enter the range: "))
# print(f"Odd Numbers till {rangez} :- ")

# for i in range(1 , rangez):
#     if ( i % 2 == 1):
#         print(f"{i}")

#using while loop

rangez=int(input("Enter the range: "))
print(f"Odd Numbers till {rangez} :- ")
num = 0
while( num <= rangez):
    if ( num % 2 == 1) :
        print(f"{num}")
num += 1
