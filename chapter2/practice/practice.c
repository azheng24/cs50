// Author: Albert
// Implement a program that check if it is a palindrome
#include <cs50.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main(void)
{
    // Read user input
    string input = get_string("Text: ");
    int j;
    printf("Reverse: ");
    for (int i = strlen(input) - 1; i >= 0; i--)
    {
        if (input[i] != input[strlen(input) - i - 1])
        {
            printf("NOT PALINDROME");
            break;
        }
        if (i == 0)
        {
            printf("PALINDROME\n");
        }
    }
}