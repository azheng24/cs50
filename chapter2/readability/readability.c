// Author: Albert
// Implement a program that computes the approximate grade level needed to comprehend some text
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

    // Count letters, sentences, and words
    double words = 1, sentences = 0, letters = 0;
    for (int i = 0; i < strlen(input); i++)
    {
        if (isalpha(input[i]))
        {
            letters++;
        }
        if (input[i] == '.' || input[i] == '!' || input[i] == '?')
        {
            sentences++;
        }
        if (input[i] == ' ')
        {
            words++;
        }
    }
    
    // Calcualte and print index
    int index = round(0.0588 * (letters / words * 100) - 0.296 * (sentences / words * 100) - 15.8);
    if (index <= 0)
    {
        printf("Before Grade 1\n");
    }
    else if (index >= 16)
    {
        printf("Grade 16+\n");
    }
    else
    {
        printf("Grade %i\n", index);
    }
}