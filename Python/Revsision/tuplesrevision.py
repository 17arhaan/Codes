n = int(input("Enter the number of elements in tuple: "))

list_1 = []

for i in range(n):
    elements = input(f"Enter the element {i+1} :")
    list_1.append(elements)


tuple_1 = tuple(list_1)
print(tuple_1)
