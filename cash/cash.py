# Implement a program that calculates the minimum number of coins required to give a user change.

import cs50
QUARTER = 25;
DIME = 10;
NICKEL = 5
PENNY = 1;

num_coins = 0;
dollar = -1
# Prompt for height of pyramid
while dollar < 0:
    dollar = cs50.get_float("Change owed: ");

# Calcualte number of coins
cents = round(dollar * 100);
num_coins += cents // QUARTER;
cents %= QUARTER;
num_coins += cents // DIME;
cents %= DIME;
num_coins += cents // NICKEL;
cents %= NICKEL;
num_coins += cents;

print(num_coins)