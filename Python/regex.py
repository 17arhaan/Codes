import re

pattern1 = r"[A-Z]was"
pattern2 = r"[a-z]was"
text = ''' Awas awas  
Hwas Jwas Iwas Owas 
rwas Lwas mwas Nwas '''

# match = re.search(pattern,text)
# print(match)

print("\n  Pattern 1  \n" )

matches = re.finditer(pattern1,text)
for match in matches:
    print(match)
for match in matches:
    print(match.span())

print("\n  Pattern 2  \n" )

matches = re.finditer(pattern2,text)
for match in matches:
    print(match.span())
    
print(type(match.span()))
