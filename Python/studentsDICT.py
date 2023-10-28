# Dictionary of students with RollNo as key and Marks in IDAP as value
student_dict = {
    "1": 75,
    "2": 42,
    "3": 91,
    "4": 65,
    "5": 55
}

# Function to calculate letter grade
def calculate_grade(marks):
    if marks < 40:
        return "F"
    elif 40 <= marks < 50:
        return "E"
    elif 50 <= marks < 60:
        return "D"
    elif 60 <= marks < 70:
        return "C"
    elif 70 <= marks < 80:
        return "B"
    elif 80 <= marks < 90:
        return "A"
    else:
        return "A+"

# Calculate and display letter grades for each student
for rollno, marks in student_dict.items():
    grade = calculate_grade(marks)
    print(f"RollNo:{rollno}, Marks: {marks}, Grade: {grade}")
