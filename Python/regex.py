import re

pattern = r"[a-z]rhaan"
text = ''' arhaan Arhaan 
Brhaan brhaan crhaan drhaan Erhaan Hrhaan'''

match = re.search(pattern,text)
print(match)

match = re.finditer(pattern,text)
for i in match:
    print(match.span())