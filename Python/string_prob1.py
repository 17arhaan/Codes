#common characters
def common_char(str1,str2):
    set1 = set(str1)
    set2 = set(str2)
    
    common = set1.intersection(set2)
    for i in common:
        print(i)

def main():
    string1 = input("Enter the first string: ")
    string2 = input("Enter the second string: ")
    common_char(string1,string2)

if __name__== "__main__":
    main()