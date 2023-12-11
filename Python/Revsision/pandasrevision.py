import numpy as np 
import pandas as pd 

# n = int(input("Enter the number of element & index : "))

# user_list = []
# for i in range(n):
#     element = input(f"Enter element {i+1}: ")
#     user_list.append(element)


# indexx = []
# for i in range(n):
#     element = input(f"Enter index {i+1}: ")
#     indexx.append(element)

# arr = np.array(user_list)
# print(arr)    

# whatever = pd.Series(arr,index = [indexx])
# print(whatever)

# print(f"After removing duplicates: {whatever.unique()}")

# whatever_dict = {
#     'A' : 123,
#     'B' : 456,
#     'C' : 789
# }

# whatever1 = pd.Series(whatever_dict)
# print(whatever1)
# whatever2 = whatever + whatever1
# print(whatever2)

#///////////////////////////////////////////////////////////////////


data = {
    'color' : ['blue','red','black','white'],
    'object': ['sky','car','space','milk'],
    'value' : [19,23,15,20]
}

indexx = [1,2,3,4]
frame = pd.DataFrame(data,index = [indexx])
print(frame)

dict = {
    'A' : {
        1: 'a',
        2: 'b',
        3: 'c'
    },
    'B' :{
        1:'d',
        2:'e',
        3:'f'
    },
    'C' :{
        1:'g',
        2:'h',
        3:'i'
    }

}
print("\n")
frame1 = pd.DataFrame(dict)
print(frame1)
print("\n")
frame2 = frame + frame1
print(frame2)
print("\n")
print(frame2.dropna())
print(frame1.sum())
print("\n")