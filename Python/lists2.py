list1=[1,2,11,4,3,9,10]
list2=['OS','CN']
#list1.extend(list2)
print(list1)

if "OS" in list2:
    print("yes")

for i in list1:
    print(f"list item is {i}")

del list1[5]
print(list1)

list1.sort()
print(list1)

list1.sort(reverse=True)
print(list1)