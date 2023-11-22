import matplotlib.pyplot as plt

no_stud = int(input("Enter the number of students: "))
names = []
grades =[]

for i in range (1,no_stud+1):
    name = input(f"Enter the name of student{i}: ")
    names.append(name)

for i in range (1,no_stud+1):
    grade = input(f"Enter the grades of student{i}: ")
    grades.append(grade)

plt.bar(names,grades,color = 'orange')
plt.xlabel('Names')
plt.ylabel('Grades')
plt.title('Results')
plt.xticks(rotation = 45 , ha = 'right')
# plt.yticks(range(0 , max(grades), 10))
# plt.axis(100)
plt.show()