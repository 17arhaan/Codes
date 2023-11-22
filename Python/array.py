def fLarge(arrayy):
    if arrayy:
        largest=max(arrayy)
        print("the largest number is ",largest)
    else:
        print("Empty String")

def main():
    arr_size = int(input("Enter the max length of array: "))
    user_array = []
    for i in range(arr_size):
        elements = int(input(f"Enter the {i+1} element: " ))
        user_array.append(elements) 

    # try:
    #     array=[int (item) for item in array]
    # except InputError:
    #     print("Input Error")

    print("User Inputted Array : ",user_array)
    fLarge(user_array)

if __name__ == '__main__':
    main()