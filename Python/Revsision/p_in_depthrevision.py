import numpy as np 
import pandas as pd 

data1 = {
    'name' : ['food','phone','car','house'],
    'price': [100,300,400,500]
}
data2 = {
    'name' : ['boat','office','plane','building'],
    'color': ['red','black','blue','white']
}

frame1 = pd.DataFrame(data1)
frame2 = pd.DataFrame(data2)
print(pd.merge(frame1,frame2))
print("\n",pd.concat([frame1,frame2],axis = 1))