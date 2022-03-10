// Author: Albert
// Determine how long it takes for a population to reach a particular size
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    //Prompt for start size
    int startSize;
    do
    {
        startSize = get_int("Start size: ");
    }
    while (startSize < 9);

    //Prompt for end size
    int endSize;
    do
    {
        endSize = get_int("End size: ");
    }
    while (endSize < startSize);

    //Calculate number of years until we reach threshold
    int year = 0;

    while (startSize < endSize)
    {
        startSize = startSize + startSize / 3 - startSize / 4;
        year++;
    }

    //Print number of years
    printf("Years: %i\n", year);
}