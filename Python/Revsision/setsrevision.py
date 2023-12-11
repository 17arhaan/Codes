n = int(input("Enter the number of elements: "))
user_set = set()
for i in range(n):
    elements = int(input(f"Element {i+1} : "))
    user_set.add(elements)
print(user_set)