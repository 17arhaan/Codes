import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt 

plt.axis([0,5,0,20])
plt.title('Nigga Wot?')



given_dict = {
    'A':10,
    'B':11,
    'C':12,
}

frame = pd.DataFrame(given_dict,index=[1,2,3])
print(frame)
plt.plot(frame)
# plt.plot([1,2,3,4],[15,10,5,1],'r-')
plt.show()