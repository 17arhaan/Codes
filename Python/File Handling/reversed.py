def main():
    filehandler = open("arhaan.txt","r")
    revrse=[]
    with open("arhaan.txt") as filehandler:
        for everyline in filehandler:
            word_list = everyline.rstrip().split(" ")
            for everyword in word_list:
                revrse.append(everyword[::-1])
            print(" ".join(revrse))
            revrse.clear()
            
if __name__ == "__main__":
    main()
