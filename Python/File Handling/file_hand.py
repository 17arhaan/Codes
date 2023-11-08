def isRead():
    filehandler = open("arhaan.txt","r")
    print("Printing each line from the file...:- ")
    with open("arhaan.txt") as filehandler:
        for everyline in filehandler:
            print(everyline)
    # print(filehandler.readlines(),end=".")

def main():
    isRead()
    

if __name__ == "__main__":
    main()