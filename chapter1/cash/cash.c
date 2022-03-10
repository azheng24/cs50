// Author: Albert
// Implement a program that asks the user how much change is owed and prints the minimum number of coins that can be made
#include <stdio.h>
#include <cs50.h>
#include <math.h>

#define QUARTER 25
#define DIME 10
#define NICKEL 5
#define PENNY 1

int main(void)
{
    int num_coins = 0;
    float dollar;

    // Prompt for change owed
    do
    {
        dollar = get_float("Change owed: ");
    }
    while (dollar < 0);

    // Calculate number of coins
    int cents = round(dollar * 100);
    num_coins += cents / QUARTER;
    cents %= QUARTER;
    num_coins += cents / DIME;
    cents %= DIME;
    num_coins += cents / NICKEL;
    cents %= NICKEL;
    num_coins += cents;

    // Print number of coins
    printf("%i\n", num_coins);
}
