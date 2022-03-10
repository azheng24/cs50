// Author: Albert
// Implement a program that calculates the sum of getting a doubled amount of money each day for a month
#include <cs50.h>
#include <stdio.h>
#include <math.h>

int main(void)
{
    // Prompt for number of days
    int days;
    do
    {
        days = get_int("Days in month: ");
    }
    while (days < 28 || days > 31);

    // Prompt for number of pennies
    long long pennies;
    do
    {
        pennies = get_int("Pennies on first day: ");
    }
    while (pennies <= 0);

    // Calculate total money
    long double total = pennies;
    for (int i = 0; i < days; i++)
    {
        total *= 2;
    }
    total = total / 100 - (pennies / 100.0);

    // Print total money
    printf("$%.2Lf\n", total);
}