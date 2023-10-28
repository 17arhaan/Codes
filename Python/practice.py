for i in range(1,5):
    print(i, end=" ")

largest = None
for val in [3,1,5]:
    if largest is None or val>largest:
        largest = val
print ("Loop", val, largest)
print ("Largest", largest)