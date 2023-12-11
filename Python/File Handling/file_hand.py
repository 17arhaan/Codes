filehandler = open("arhaan.txt","w")
filehandler.write("this is appended line..")
print("Printing each line from the file...:- ")
with open("arhaan.txt") as filehandler:
    for everyline in filehandler:
        print(everyline)
filehandler.close()