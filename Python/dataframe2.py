import numpy as np
import pandas as pd 

random_dict1 = {
   'Name' : ['Arhaan','Arhaan','Arhaan'],
   'R.No' : [16,17,18],
}
random_dict2 = {
   'Name' : ['1','2','3'],
}
R_No = [1,2,3]
frame1 = pd.DataFrame(random_dict1)+pd.DataFrame(random_dict2,index=R_No)
frame = pd.DataFrame(random_dict1,index=R_No)
print(frame1)
print(frame.describe())