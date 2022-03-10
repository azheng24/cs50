// Author: Albert
// Implement a program that implements a substitution cipher

#include <cs50.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// Defined constants
#define KEY_LENGTH 26

int main(int argc, string argv[])
{
    // Check key validity
    if (argc != 2)
    {
        printf("Usage: ./substitution key\n");
        return 1;
    }
    else if (strlen(argv[1]) != KEY_LENGTH)
    {
        printf("Key must contain 26 characters.");
    }

    // Iterate through key
    for (int i = 0; i < KEY_LENGTH; i++)
    {
        // Check if key consists of letters
        if (!(isalpha(argv[1][i])))
        {
            return 1;
        }
        // Check for no repeating letters in key (uppercase & lowercase)
        for (int j = i + 1; j < 26; j++)
        {
            if (tolower(argv[1][i]) == tolower(argv[1][j]))
            {
                return 1;
            }
        }
    }

    // Read user input
    string plaintext = get_string("plaintext: ");
    printf("ciphertext: ");

    // Iterate through input and print correct encryption
    for (int i = 0; i < strlen(plaintext); i++)
    {
        if (isupper(plaintext[i]))
        {
            printf("%c", toupper(argv[1][plaintext[i] - 'A']));
        }
        else if (islower(plaintext[i]))
        {
            printf("%c", tolower(argv[1][plaintext[i] - 'a']));
        }
        else
        {
            printf("%c", plaintext[i]);
        }
    }
    printf("\n");
}