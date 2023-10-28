#convert days to years,weeks and days

no_of_days=int(input("Enter the the number of days: "))
no_of_years=int(no_of_days /365)
no_of_weeks=int(no_of_days % 365/7)
rem_no_of_days=int(no_of_days % 365%7)
print(f"years = {no_of_years}, weeks = {no_of_weeks} and remaining days = {rem_no_of_days}")