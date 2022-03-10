// Greets a user by their name

#include <cs50.h>
#include <stdio.h>

int main(int argc, string argv[])
{
    if (argc != 2)
    {
        printf("Hello: ./hello <name>\n");
        return 1;
    }

    // Collect a string from the user, then print their name
    printf("Hello, %s!\n", argv[1]);
}