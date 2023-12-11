import re

pattern1 = r"[A-Z]was"
pattern2 = r"#0."
text = ''' Awas awas  
Hwas Jwas Iwas Owas 
rwas Lwas mwas Nwas #0.1 #0.2 '''

print("\n  Pattern 1  \n" )

matches = re.finditer(pattern1,text)
for match in matches:
    print(match)
for match in matches:
    print(match.span())

print("\n  Pattern 2  \n" )

matches = re.finditer(pattern2,text)
for match in matches:
    print(match)
for match in matches:
    print(match.span())
    
