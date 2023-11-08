import re

def isInput(filehandler):
    filehandler = open("inputfile.txt","r")
    for everyline in filehandler:
        print(everyline)

def main():
    isInput()
   
if __name__ == "__main__":
    main()
