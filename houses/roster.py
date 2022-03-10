import sys
import csv
from cs50 import SQL

# Check argv count
if len(sys.argv) != 2:
    print("Usage: python roster.py house")
    sys.exit(1)

# Connect to database
db = SQL("sqlite:///students.db")

# Go through each row/student in dictionary
house = sys.argv[1]
toPrint = db.execute("""SELECT first, middle, last, birth FROM students WHERE house = ? ORDER BY last;""",
            house)


for row in toPrint:
    if (row['middle'] != None):
        print(row['first'] + " " + row['middle'] + " " + row['last'] + ", born " + str(row['birth']))
    else:
        print(row['first'] + " " + row['last'] + ", born " + str(row['birth']))