import pandas as pd
import numpy as np 

s1 = pd.Series([1,2,3,4,5],index = ['a','b','c','d','e'])

# print(s1)
# print(s1/2)
# print(s1>3)

s2 = pd.Series([1,1,0,5,3,3,4,5],index = ['yellow','white','blue','cyan','green','white','black','red',])

# print(s2)
# print(f"\nUnique Items : {s2.unique()}")
# print(f"\n{s2.value_counts()}")
# print(f"\nIs 4 or 3 present in this Series ?? :- \n{s2}\n{s2.isin([4,3])}")

random_dict = {
    'A' : 10,
    'B' : 30,
    'C' : 15,
    'D' : 50,
    'E' : 70,
}
numbers = [10,20,30,40,50]
s3 = pd.Series(random_dict)
s4 = pd.Series(numbers,index = random_dict)
print(s3)
print(s4)