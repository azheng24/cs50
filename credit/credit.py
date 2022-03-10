import cs50
# Prompt user for credit card number
number = cs50.get_string("Number: ");
total = 0;
# Calculate vailidity of card
for i in range(len(number) - 1, -1, -1):
    if (len(number) - i - 1) % 2 == 0:
        total += int(number[i])
    elif (int(number[i]) >= 5):
        total += int(number[i]) * 2 - 9
    else:
        total += int(number[i]) * 2
# Determine type of card
if total % 10 == 0:
    if number[0:2] == "37" or number[0:2] == "34":
        print("AMEX")
    elif number[0] == "4":
        print("VISA")
    elif int(number[0:2]) >= 51 or int(number[0:2] <= 55):
        print("MASTERCARD")
    else:
        print("INVALID")
else:
    print("INVALID")