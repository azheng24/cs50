// Author: Albert
// Convert celsius to fahrenheit
#include <stdio.h>
#include <cs50.h>

int main(void)
{
    // Prints celsius after conversion
    float fahrenheit = get_float("C: ");
    fahrenheit = fahrenheit * 9 / 5 + 32;
    printf("F: %.1f\n", fahrenheit);

}