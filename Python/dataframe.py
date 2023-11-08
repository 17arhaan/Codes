import pandas as pd
import numpy as np

# random_dict = {
#    'S.No' : ['A','B','C','D','E'],
#    'A.No' : [10,100,1000,10000,100000],
# }

# R_No = [1,2,3,4,5]
# frame = pd.DataFrame(random_dict,index=R_No)

# nested_dict = {
#     'Red' : {
#         'a' : 20,
#         'b' : 30,
#         'c' : 40,
#         'x' : 50,
#         'y' : 60,
#         'z' : 70
#     },
#     'Blue' : {
#         'a' : 200,
#         'b' : 300,
#         'c' : 400,
#         'x' : 500,
#         'y' : 600,
#         'z' : 700
#     }
# }

# # frame = pd.DataFrame(nested_dict)

# print(frame)
# # print(frame.columns)
# # print(frame['S.No'])
# # print(frame.values)
# # frame['S.No']=12
# # frame['A.No'][2] = 1
# # arrng = pd.Series(np.arange(1,10,1.5))
# # frame['S.No']= arrng
# # print(frame)
# # print(frame.isin([20,'Red']))
# # print(frame.isin([2.5,'S.No']))
# frame.reindex(range(6),method = 'bfill')
# print(frame)

def main():
    sequeal = []
    students = input("Enter the no. of students: ")
    sequeal.append(students)
    given_dict = {}
    for students in sequeal:
        while True:
            key = input("Enter the name (or press quit to exit) : ")
            if ( key == 'quit'):
                print("Exiting !!")
                break
            value = input("Enter the roll no : ")
            given_dict[key] = value   
    print("Entered Dataframe is :- \n",given_dict)
    isDataFrame(given_dict,sequeal)

def isDataFrame(parameter,amount):

    frame = pd.DataFrame(parameter,index=amount)
    print(frame)

if __name__ == "__main__":
    main()