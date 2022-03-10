// Author: Albert
// Implement a program that implements a command line calculator
#include <cs50.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>


int main(int argc, string argv[])
{

    // Read user input and initialize variables
    float num1 = atof(argv[1]);
    float num2 = atof(argv[3]);
    char operation = argv[2][0];
    float answer;

    // Perform operation
    if (operation == '+')
    {
        answer = num1 + num2;
    }
    else if (operation == '-')
    {
        answer = num1 - num2;
    }
    else if (operation == 'x')
    {
        answer = num1 * num2;
    }
    else if (operation == '/')
    {
        answer = num1 / num2;
    }
    else if (operation == '%')
    {
        answer = (int)(num1 / num2);
        answer = num1 - (num2 * answer);
    }
    else
    {
        printf("Enter valid operator\n");
        return 1;
    }

    // Print answer
    printf("%f\n", answer);
}
