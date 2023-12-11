n = int(input("Enter the number of elements in the list: "))

list = []
for i in range (n):
    element = input(f"Enter element {i + 1}: ")
    list.append(element)

for i in list:
    print(i)
print("List:",list)
sorted_list = list.sort()
print("Sorted List: ",sorted_list)
list2 = ["arhaan","girdhar"]
nested_list =[[list],[list2]]
print(nested_list)