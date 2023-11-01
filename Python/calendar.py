#convert days to years,weeks and days
no_of_days=int(input("Enter the number of days : "))

no_of_weeks=int(no_of_days % 365 / 7)
no_of_years=int(no_of_days / 365)
rem_no_of_days=int(no_of_days % 365 % 7)

print(f" Years = {no_of_years} , Weeks = {no_of_weeks} and Remaining Days = {rem_no_of_days}")