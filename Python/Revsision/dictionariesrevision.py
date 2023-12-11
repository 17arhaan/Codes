dict = {
    4: 'arhaan' , 
    2: 'girdhar' , 
    3: 'arha' , 
    1: ' gird'
}
print(dict)
sorted_dict = sorted(dict)
print(sorted_dict)
dict.update({5:"arrhagird"})
print(dict)

num_pairs = int(input("Enter the number of key-value pairs in the dictionary: "))

user_dict = {}

for i in range(num_pairs):
    key = input(f"Enter key {i + 1}: ")
    value = input(f"Enter value for {key}: ")
    user_dict[key] = value

print("User input dictionary:", user_dict)
