// Author: Albert
// Implement a program to validate ISBN-10 numbers.
#include <stdio.h>
#include <cs50.h>

int main(void)
{
    // Prompt for ISBN number
    long long num = get_long("ISBN: ");
    int digit, total;

    // Iterate through each digit of num and calculate total
    for (int i = 10; i > 0; i--)
    {
        digit = num % 10;
        num /= 10;
        total = total + digit * i;
    }

    // Check remainder and print validity
    if (total % 11 == 0)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }


}