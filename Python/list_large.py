def fLarge(list_input,n):
    if list_input:
        largest=max(list_input)
        print("the largest number is ",largest)
    else:
        print("Empty String")

def main():
    n = input("Enter list items:" )
    list_input=n.split()
    
    try:
        list_input=[int (item) for item in list_input]
    except InputError:
        print("Input Error")
    print(f"User Inputted list:- ",list_input)
    fLarge(list_input,n)

if __name__ == '__main__':
    main()