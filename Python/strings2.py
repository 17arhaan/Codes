fname = input("Enter your first name: ")
lname = input("Enter your last name: ")

name = fname + lname

print(f"full name : {name}")

for character in name:
    print(character)
print(name[::])

print('arhaan' in 'arhaan girdhar')