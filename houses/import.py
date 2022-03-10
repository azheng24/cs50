import sys
import csv
from cs50 import SQL

# Check argv count
if len(sys.argv) != 2:
    print("Usage: python import.py characters.csv")
    sys.exit(1)

# Read in student csv file as dictionary
data = csv.DictReader(open(sys.argv[1]))

# Connect to database
db = SQL("sqlite:///students.db")

# Go through each row/student in dictionary
for student in data:
    studentList = student['name'].split()

    if(len(studentList) == 2):
        db.execute("""INSERT INTO students (first, last, house, birth) VALUES (?, ?, ?, ?);""",
            studentList[0], studentList[1], student['house'], student['birth'])
    else:
        db.execute("""INSERT INTO students (first, middle, last, house, birth) VALUES (?, ?, ?, ?, ?);""",
            studentList[0], studentList[1], studentList[2], student['house'], student['birth'])
