import numpy as np 

# user_list = []
# n = int(input("Enter the number of elements: "))
# for i in range(n):
#     element = input(f"Enter element {i+1}: ")
#     user_list.append(element)
# arr = np.array(user_list,dtype ='|S1')
# print(arr.dtype)
# arr = np.array(user_list)
# print(arr)

arr1 = np.zeros((3,3))
print(arr1)
print("\n")
arr2 = np.ones((5,5))
print(arr2)
print("\n")
arr3 = np.arange(3,12,1)
print(arr3)
print("\n")
arr4 = np.arange(3,12,1).reshape(3,3)
print(arr4)
print("\n")
arr5 = np.linspace(1,10,9).reshape(3,3)
print(arr5)
print("\n")
print(arr5.sum())
print(arr4.transpose())