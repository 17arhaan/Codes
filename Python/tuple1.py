tup1=(20,12,13,45,64,21,89,21,21)
tup2=('hi','I','am','Arhaan')
i = 0
for i in tup1:
    print(f"element is {i}") 

res=tup1.count(21)
print(res)

res1=tup1.index(64,2,7)
print(res1)

tup3=tup1+tup2
print(f"the sum of both tuples is: {tup3}")