import csv
import sys

def main():
    sys.argv
    # Check for user input
    if (len(sys.argv) != 3):
        print("Usage: python dna.py data.csv sequence.txt")
        return 0

    # Read files
    database = csv.DictReader(open(sys.argv[1]))
    sequence = open(sys.argv[2]).read()
    strnum = []

    # Default arra to 0
    for i in range(len(database.fieldnames) - 1):
        strnum.append(0)

    # Go through each STR
    for i in range(1, len(database.fieldnames)):
        STR = database.fieldnames[i]
        strcnt = 0
        j = 0 # STR checker iterator

        # Go through all possible cases of STR
        while (j < len(sequence) - len(STR)):
            if (sequence[j:j+len(STR)] == STR): # STR detection
                strcnt += 1
                # Determine consecutive STRs
                for k in range(j + len(STR), len(sequence) - len(STR), len(STR)):
                    if(sequence[k:k+len(STR)] == STR):
                        strcnt += 1
                    else: # no more consecutive STR
                        if (strcnt > strnum[i - 1]):
                            strnum[i - 1] = strcnt
                        strcnt = 0;
                        j = k # no longer needed to check sequence from j --> k
                        break
            j += 1

    # Check STR with each person in database
    for row in database:
        name = row["name"]
        # Check STR for each person
        for i in range(0, len(row) - 1):
            if strnum[i] != int(row[database.fieldnames[i+1]]):
                break
        else:
            print(name)
            exit()
    print("No match")

main()