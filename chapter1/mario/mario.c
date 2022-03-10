// Author: Albert
// Implement a program that prints out a pyramid using hashtags
#include <cs50.h>
#include <stdio.h>
#include <math.h>

// Constants
#define MIN_INPUT 1
#define MAX_INPUT 8

int main(void)
{
    // Prompt for height of pyramid
    int height;
    do
    {
        height = get_int("Height: ");
    }
    while (height < MIN_INPUT || height > MAX_INPUT);

    // Iterate through pyramid starting from the top
    for (int i = 0; i < height; i++)
    {
        // Print spaces
        for (int j = height - 1; j > i; j--)
        {
            printf(" ");
        }
        // Print hashtags on left side of pyramid
        for (int j = 0; j <= i; j++)
        {
            printf("#");
        }
        // Print hashtags on right side of pyramid
        printf("  ");
        for (int j = 0; j <= i; j++)
        {
            printf("#");
        }
        // Print new line
        printf("\n");

    }

}